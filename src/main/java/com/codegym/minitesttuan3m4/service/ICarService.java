package com.codegym.minitesttuan3m4.service;

import com.codegym.minitesttuan3m4.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICarService extends GeneralService<Car> {
    Page<Car> findByCode(Pageable pageable,String code);
    Page<Car> sortAllByPriceOrderByPrice(Pageable pageable);
    Page<Car> sortAllByType(Pageable pageable);
}
