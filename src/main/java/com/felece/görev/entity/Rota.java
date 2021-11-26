package com.felece.görev.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "rota")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Rota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    @JoinColumn(name ="baslangıc_sehri")
    private Sehir baslangıcSehri;

    @Column(name ="tarih")
    private Date tarih;

    @ManyToOne()
    @JoinColumn(name ="bitis_sehri")
    private Sehir sehirBitis;

    @JoinColumn(name = "assignee_bilet_id")
    @OneToMany(mappedBy="",fetch = FetchType.LAZY)
    private List<Bilet> biletList;

    @JoinColumn(name = "assignee_rota_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Arac> aracList;

}
