package com.codegym.minitesttuan3m4.service.impl;

import com.codegym.minitesttuan3m4.model.Type;
import com.codegym.minitesttuan3m4.repo.TypeRepository;
import com.codegym.minitesttuan3m4.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Service
public class TypeService implements ITypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Page<Type> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Type> findById(Long id) {
        return typeRepository.findById(id);
    }

    @Override
    public Type save(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public void remove(Long id) {
        typeRepository.deleteById(id);
    }

    @Override
    public Page<Type> findByName(Pageable pageable, String name) {
        return typeRepository.searchName(pageable,name);
    }
}
