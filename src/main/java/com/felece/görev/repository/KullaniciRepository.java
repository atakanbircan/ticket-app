package com.felece.görev.repository;

import com.felece.görev.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullaniciRepository extends JpaRepository<Kullanici,Long> {

    Kullanici findByEmail(String email);

}
