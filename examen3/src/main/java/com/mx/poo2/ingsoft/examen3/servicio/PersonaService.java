package com.mx.poo2.ingsoft.examen3.servicio;

import com.mx.poo2.ingsoft.examen3.interfaceService.IPersonaService;
import com.mx.poo2.ingsoft.examen3.interfaces.IPersona;
import com.mx.poo2.ingsoft.examen3.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona dato;
    @Override
    public List<Persona> listar() {
        return (List<Persona>) dato.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete() {

    }
}
