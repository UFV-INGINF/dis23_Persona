package com.ufv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PersonaList personas = new PersonaList();


        Persona person = new Persona();
        Persona person2 = new Persona();

        person.setNombre("Nacho");
        person.setApellido("Serrano");
        person.setDni("55555555A");
        person.setSexo(Sexo.sexo.v);


        System.out.println("Lectura fichero");
        ArrayList<Persona> miLista = ReadFile.readFile();
        System.out.println(miLista);
        System.out.println("-------------------------");

        personas.personaList.add(person);
        personas.personaList.add(person2);
        System.out.println(personas.personaList);
        System.out.println(personas.personaList.size());

    }
}