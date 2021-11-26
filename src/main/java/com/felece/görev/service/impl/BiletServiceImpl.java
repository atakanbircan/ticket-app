package com.felece.görev.service.impl;

import com.felece.görev.entity.Bilet;
import com.felece.görev.repository.BiletRepository;
import com.felece.görev.service.BiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiletServiceImpl implements BiletService {

    @Autowired
    private BiletRepository biletRepository;

    @Override
    public Bilet getById(Long id) {
        return biletRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bilet> getAll() {
        return biletRepository.findAll();
    }

    @Override
    public boolean update(Bilet bilet) {

        Bilet updatedBilet =biletRepository.save(bilet);
        if(updatedBilet == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean create(Bilet bilet) {
        Bilet createdBilet =biletRepository.save(bilet);
        if(createdBilet == null){
            return false;
        }
        return true;
    }

    @Override
    public void delete(Bilet bilet) {
        biletRepository.delete(bilet);
    }


    @Override
    public Page<Bilet> getAllPageable(Pageable pageable) {
        return null;
    }
}
