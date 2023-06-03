package com.mx.poo2.ingsoft.examen3.modelo;


import javax.persistence.*;


@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    public Persona(){

    }
    public Persona(int id, String nombre){
        super();
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
