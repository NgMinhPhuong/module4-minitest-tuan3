package com.codegym.minitesttuan3m4.service;

import com.codegym.minitesttuan3m4.model.Type;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface ITypeService extends GeneralService<Type> {
    Page<Type> findByName(Pageable pageable,String name);
}
