package com.felece.görev.service;

import com.felece.görev.entity.Bilet;
import com.felece.görev.entity.Sehir;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SehirService {
    Sehir getById(Long id);

    List<Sehir> getAll();

    boolean update(Sehir sehir);

    boolean create(Sehir sehir);

    void delete(Sehir sehir);

    Page<Sehir> getAllPageable(Pageable pageable);
}
