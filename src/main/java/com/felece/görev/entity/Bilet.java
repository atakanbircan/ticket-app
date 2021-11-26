package com.felece.görev.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name= "biletler")
public class Bilet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    @JoinColumn(name="arac_id")
    private Arac vehicle;

    @Column(name = "fiyat")
    private Integer fiyat;

    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;

    @ManyToOne()
    @JoinColumn(name="status_id")
    private BiletStatus biletStatus;

    @JoinColumn(name = "rota")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rota rota;

    @JoinColumn(name = "kullanıcı_id")
    @ManyToOne()
    private Kullanici kullanici;

}

