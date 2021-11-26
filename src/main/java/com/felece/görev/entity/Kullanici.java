package com.felece.görev.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="kullanici")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "email",length = 20,unique = true)
    private String email;

    @Column(name = "password",length = 20)
    private String password;

    private String role;

    @OneToMany(mappedBy = "kullanici")
    private List<Bilet> biletList;

}
