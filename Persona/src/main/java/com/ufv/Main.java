package com.ufv;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Hello world!")
//
//        ;

        Persona person = new Persona();

        person.setNombre("Nacho");
        person.setApellido("Serrano");
        person.setDni("55555555A");
        person.setSexo(Sexo.sexo.v);

        System.out.println(person.toString());

    }
}