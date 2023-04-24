package com.App.inventario.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rol {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String descripcion;
}
