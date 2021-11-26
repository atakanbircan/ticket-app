package com.felece.görev.service.impl;

import com.felece.görev.entity.Kullanici;
import com.felece.görev.repository.KullaniciRepository;
import com.felece.görev.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KullaniciServiceImpl implements KullaniciService {
    @Autowired
    private KullaniciRepository kullaniciRepository;
    @Override
    public Kullanici getById(Long id) {
        return kullaniciRepository.findById(id).orElse(null) ;
    }

    @Override
    public List<Kullanici> getAll() {
        return kullaniciRepository.findAll();
    }

    @Override
    public boolean update(Kullanici kullanici) {
        Kullanici updatedKullanici=kullaniciRepository.save(kullanici);
        if(updatedKullanici== null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean create(Kullanici kullanici) {
        Kullanici createdKullanici=kullaniciRepository.save(kullanici);
        if (createdKullanici==null){
            return false;
        }
            return true;
    }

    @Override
    public void delete(Long id) {
        kullaniciRepository.deleteById(id);
    }

}
