package com.codegym.minitesttuan3m4.repo;

import com.codegym.minitesttuan3m4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true, value = "select * from user where username = ?1")
    User findByUsername(String username);

}
