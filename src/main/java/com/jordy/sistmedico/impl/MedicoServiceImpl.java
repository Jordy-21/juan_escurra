package com.jordy.sistmedico.impl;

import com.jordy.sistmedico.model.Medico;
import com.jordy.sistmedico.repo.IGenericRepo;
import com.jordy.sistmedico.repo.IMedicoRepo;
import com.jordy.sistmedico.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicoServiceImpl extends CRUDImpl<Medico, Integer> implements IMedicoService {
    @Autowired
   private IMedicoRepo repo;
    protected IGenericRepo<Medico, Integer> getRepo(){
        return repo;
    }
}
