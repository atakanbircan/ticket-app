package com.felece.görev.repository;

import com.felece.görev.entity.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiletRepository extends JpaRepository<Bilet,Long> {

}
