package com.felece.görev.service;

import com.felece.görev.entity.Arac;
import com.felece.görev.entity.Bilet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AracService {

    Arac getById(Long id);
    List<Arac> getAll();
    boolean update(Arac arac);
    boolean create(Arac arac);
    void delete(Long id);






    Page<Arac>  getAllPageable(Pageable pageable);
}
