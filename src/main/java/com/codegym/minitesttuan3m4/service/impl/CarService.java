package com.codegym.minitesttuan3m4.service.impl;

import com.codegym.minitesttuan3m4.model.Car;
import com.codegym.minitesttuan3m4.repo.CarRepository;
import com.codegym.minitesttuan3m4.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService implements ICarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return carRepository.findAll(pageable);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void remove(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Page<Car> findByCode(Pageable pageable, String code) {
        return carRepository.findByCode(pageable,code);
    }

    @Override
    public Page<Car> sortAllByPriceOrderByPrice(Pageable pageable) {
        return carRepository.sortAllByPriceOrderByPrice(pageable);
    }

    @Override
    public Page<Car> sortAllByType(Pageable pageable) {
        return carRepository.sortAllByType(pageable);
    }
}
