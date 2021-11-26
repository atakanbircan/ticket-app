package com.felece.görev.repository;

import com.felece.görev.entity.Sehir;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SehirRepository extends JpaRepository<Sehir,Long> {


}
