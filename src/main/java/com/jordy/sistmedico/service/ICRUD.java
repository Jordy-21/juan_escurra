package com.jordy.sistmedico.service;

import com.jordy.sistmedico.model.Paciente;

import java.util.List;

public interface ICRUD<T, ID> {
    T registrar(T t) throws Exception;
    T modificar(T t) throws Exception;
    List<T> listar() throws Exception;
    T listarPorId(ID id) throws Exception;
    void eliminar(ID id) throws Exception;
}
