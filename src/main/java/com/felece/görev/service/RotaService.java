package com.felece.görev.service;

import com.felece.görev.entity.Arac;
import com.felece.görev.entity.Bilet;
import com.felece.görev.entity.Rota;
import com.felece.görev.entity.Sehir;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RotaService {

    Rota getById(Long id);

    List<Rota> getAll();

    boolean update(Rota rota);

    boolean create(Rota rota);

    void delete(Rota rota);

    Page<Rota>getAllPageable(Pageable pageable);

}
