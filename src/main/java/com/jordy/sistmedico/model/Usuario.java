package com.jordy.sistmedico.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    //min 25 entity Consulta
    @Id
    private Integer idUsuario;
    @Column(name = "nombre", nullable = false, length = 50)
    private String username;
    @Column(name = "clave", nullable = false, length = 50)
    private String password;
    @Column(name = "estado", nullable = false, length = 50)
    private boolean enable;
    @ManyToMany(fetch = FetchType.EAGER) //su razón de ser es generar una tabla intermedia, y el fetch es para cuando Select * from Usuario where  username = jordy,el fetch hara una consulta de los roles
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"),
            inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol")) //la tabla no existe para crearla con jonitable y el inverseJoinColumsn por que rol es de otra clase
    private List<Rol> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
