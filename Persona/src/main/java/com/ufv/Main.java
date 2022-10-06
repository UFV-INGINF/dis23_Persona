package com.ufv;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PersonaList personas = new PersonaList();


//        System.out.println("Hello world!")
//
//        ;
        Scanner lectura = new Scanner (System.in);
        Persona person = new Persona();
        Persona person2 = new Persona();

        person.setNombre("Nacho");
        person.setApellido("Serrano");
        person.setDni("55555555A");
        person.setSexo(Sexo.sexo.v);

//        Persona person2 = new Persona();
        String Nombre;


        System.out.println("Lectura fichero");
        ArrayList<Persona> miLista = ReadFile.readFile();
        System.out.println(miLista.toString());
        System.out.println("-------------------------");

        personas.personaList.add(person);
        personas.personaList.add(person2);
        System.out.println(personas.personaList.toString());
        System.out.println(personas.personaList.size());

    }
}