package com.felece.görev.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "bilet_statuses")
public class BiletStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "status_name")
    private String name;

    @OneToMany(mappedBy = "biletStatus")
    private List<Bilet> biletList;
}
