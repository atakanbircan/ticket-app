package com.felece.görev.service.impl;

import com.felece.görev.entity.Rota;
import com.felece.görev.repository.RotaRepository;
import com.felece.görev.service.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RotaServiceImpl implements RotaService {

    @Autowired
    private RotaRepository rotaRepository;

    @Override
    public Rota getById(Long id) {

        return rotaRepository.findById(id).orElse(null);

    }

    @Override
    public List<Rota> getAll() {
        return rotaRepository.findAll();
    }

    @Override
    public boolean update(Rota rota) {
        Rota updatedRota=rotaRepository.save(rota);
        if (updatedRota==null) {
        return false;
        }
        return true;
    }

    @Override
    public boolean create(Rota rota) {
        Rota createdRota=rotaRepository.save(rota);
        if (createdRota==null){
            return false;
        }
        return true;
    }

    @Override
    public void delete(Rota rota) {
        rotaRepository.delete(rota);

    }

    @Override
    public Page<Rota> getAllPageable(Pageable pageable) {
        return null;
    }
}
