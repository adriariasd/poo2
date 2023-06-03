package com.mx.poo2.ingsoft.examen3.interfaces;

import com.mx.poo2.ingsoft.examen3.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
}
