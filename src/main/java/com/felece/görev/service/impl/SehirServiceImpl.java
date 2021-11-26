package com.felece.görev.service.impl;

import com.felece.görev.entity.Sehir;
import com.felece.görev.repository.RotaRepository;
import com.felece.görev.repository.SehirRepository;
import com.felece.görev.service.SehirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SehirServiceImpl implements SehirService {

    @Autowired
    private SehirRepository sehirRepository;
    @Override
    public Sehir getById(Long id) {
        return sehirRepository.findById(id).orElse(null) ;
    }

    @Override
    public List<Sehir> getAll() {
        return sehirRepository.findAll() ;
    }

    @Override
    public boolean update(Sehir sehir) {
        Sehir updatedSehir=sehirRepository.save(sehir);
        if (updatedSehir==null){
            return false;
        }
        return true;
    }

    @Override
    public boolean create(Sehir sehir) {
        Sehir createdSehir=sehirRepository.save(sehir);
        if(createdSehir==null){
            return false;

        }
        return true;
    }

    @Override
    public void delete(Sehir sehir) {
        sehirRepository.delete(sehir);

    }

    @Override
    public Page<Sehir> getAllPageable(Pageable pageable) {
        return null;
    }
}


