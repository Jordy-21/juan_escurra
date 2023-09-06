package com.jordy.sistmedico.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "consulta_examen")
//Aqui le decimos que los id de ConsultaExamen estan definidos en ConsultaExamenPK
@IdClass(ConsultaExamenPK.class)
public class ConsultaExamen{
    @Id
    private Consulta consulta;
    @Id
    private Examen examen;//cap 5 min 01:18:30

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
