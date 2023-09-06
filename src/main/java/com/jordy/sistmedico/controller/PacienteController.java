package com.jordy.sistmedico.controller;

import com.jordy.sistmedico.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jordy.sistmedico.service.IPacienteService;

import java.util.List;

//Aqui mi servicio rest
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private final  IPacienteService service;
    public PacienteController(IPacienteService service){
        this.service=service;
    }
    @GetMapping
    public List<Paciente> listar() throws Exception{
        return service.listar();
    }
    @GetMapping("/{id}")
    public Paciente listarPorId(@PathVariable("id") Integer id) throws Exception{
        return service.listarPorId(id);
    }
    @PostMapping
    //@RequestBody para pasar de json a java
    public Paciente registrar(@RequestBody Paciente paciente) throws Exception{
        return service.registrar(paciente);
    }
    @PutMapping
    public Paciente modificar(Paciente paciente) throws Exception{
        return service.modificar(paciente);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) throws Exception{
        service.eliminar(id);
    }
}
