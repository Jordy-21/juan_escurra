package com.jordy.sistmedico.repo;

import com.jordy.sistmedico.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer> {

}
