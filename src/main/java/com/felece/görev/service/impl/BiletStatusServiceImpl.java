package com.felece.görev.service.impl;

import com.felece.görev.entity.BiletStatus;
import com.felece.görev.repository.BiletStatusRepository;
import com.felece.görev.service.BiletStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BiletStatusServiceImpl implements BiletStatusService {

    @Autowired
    private BiletStatusRepository biletStatusRepository;
    @Override
    public List<BiletStatus> getAllStatuses() {
        return biletStatusRepository.findAll();
    }
}
