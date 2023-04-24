package com.App.inventario.Model;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "tb_productos")
@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long codigo;

    private String nom_pro;
    private String pre_pro;
    private String lot_pro;
    private String can_pro;
    private String mar_pro;
    private String col_pro;
    private String obs_pro;
    private String cat_pro;
    private String cod_emp_pro;
}
