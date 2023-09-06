package com.jordy.sistmedico.impl;

import com.jordy.sistmedico.model.Paciente;
import com.jordy.sistmedico.repo.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.jordy.sistmedico.repo.IPacienteRepo;
import com.jordy.sistmedico.service.IPacienteService;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente, Integer> implements IPacienteService {
    @Autowired
    private IPacienteRepo repo;

    @Override
    protected IGenericRepo<Paciente, Integer> getRepo() {
        return repo;
    }
}
