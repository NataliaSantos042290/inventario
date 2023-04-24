package com.App.inventario.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Table(name = "tb_user")
@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "doc_usu", nullable = false,length = 20)
    private Long doc_usu;

    @Column(name = "nom_usu", nullable = false,length = 70)
    private String nom_usu;

    @Column(name = "dir_usu", nullable = false,length = 150)
    private String dir_usu;

    @Column(name= "tel_usu", nullable = false,length = 15)
    private String tel_usu;

    @Column(name= "ema_usu", nullable = false,length = 50)
    private String ema_usu;

    @ManyToMany
    //Union tabla transaccion
    @JoinTable(name = "usuario_roles",joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name="role_id"))

    private Set<Rol>roles;
}
