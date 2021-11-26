package com.felece.görev.repository;

import com.felece.görev.entity.Arac;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AracRepository extends JpaRepository<Arac,Long> {

}
