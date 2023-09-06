package com.jordy.sistmedico.repo;

import com.jordy.sistmedico.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

}
