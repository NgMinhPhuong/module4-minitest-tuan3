package com.codegym.minitesttuan3m4.repo;

import com.codegym.minitesttuan3m4.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    Page<Car> findByCode(Pageable pageable,String code);

    @Query(nativeQuery = true,value = "select * from car c ORDER BY c.price ASC")
    Page<Car> sortAllByPriceOrderByPrice(Pageable pageable);
    @Query(nativeQuery = true,value = "select * from car c ORDER BY c.type_id ASC")
    Page<Car> sortAllByType(Pageable pageable);

}
