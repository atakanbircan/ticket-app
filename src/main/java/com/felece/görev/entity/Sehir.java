package com.felece.görev.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "sehir")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Sehir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;
}
