package com.jordy.sistmedico.model;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecilidad;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "descripcion", unique = false, length = 50)
    private String descripcion;

    public Integer getIdEspecilidad() {
        return idEspecilidad;
    }

    public void setIdEspecilidad(Integer idEspecilidad) {
        this.idEspecilidad = idEspecilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
