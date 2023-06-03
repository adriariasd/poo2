package com.mx.poo2.ingsoft.examen3.interfaceService;

import com.mx.poo2.ingsoft.examen3.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona p);
    public void delete();
}
