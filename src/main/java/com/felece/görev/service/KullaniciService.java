package com.felece.görev.service;

import com.felece.görev.entity.Arac;
import com.felece.görev.entity.Kullanici;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KullaniciService {

    Kullanici getById(Long id);
    List<Kullanici> getAll();
    boolean update(Kullanici kullanici);
    boolean create(Kullanici kullanici);
    void delete(Long id);
}
