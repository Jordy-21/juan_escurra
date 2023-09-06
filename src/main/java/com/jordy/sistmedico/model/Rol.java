package com.jordy.sistmedico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
    //No se pondra auto generado por que se pondra de forma manual el id (Spring Segurity)
    @Id
    private Integer idRol;
    @Column(name = "nombre", nullable = false, length = 50, unique = true)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
