package com.felece.görev.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name= "arac")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Arac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model",length = 20)
    private String model;

    @Column(name = "koltuksayisi")
    private Integer koltukSayisi;

    @OneToMany(mappedBy = "vehicle")
    private List<Bilet> biletList;
}

