package com.felece.görev.service.impl;

import com.felece.görev.entity.Arac;
import com.felece.görev.repository.AracRepository;
import com.felece.görev.service.AracService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AracServiceImpl implements AracService {

    @Autowired
    private  AracRepository aracRepository;



    @Override
    public Arac getById(Long id) {

        return aracRepository.findById(id).orElse(null);
    }

    @Override
    public List<Arac> getAll() {

        return aracRepository.findAll();
    }

    @Override
    public boolean update(Arac arac) {
        Arac updatedArac= aracRepository.save(arac);
        if (updatedArac==null){
            return false;
        }
        return true;
    }

    @Override
    public boolean create(Arac arac) {
        Arac createdArac=aracRepository.save(arac);
        if (createdArac==null){
        return false;}
        return true;
    }

    @Override
    public void delete(Long id) {
        aracRepository.deleteById(id);

    }



    @Override
    public Page<Arac> getAllPageable(Pageable pageable) {
        return null;
    }
}