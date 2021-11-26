package com.felece.görev.service;

import com.felece.görev.entity.Bilet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BiletService {

    Bilet getById(Long id);
    List<Bilet> getAll();
    boolean update(Bilet bilet);
    boolean create(Bilet bilet);
    void delete(Bilet bilet);

    Page<Bilet>getAllPageable(Pageable pageable);
    
}
