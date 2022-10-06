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

        Persona person2 = new Persona();
        String Nombre;

        System.out.print("Introduzca Nombre: ");
        person2.setNombre(lectura.next());

        System.out.print("Introduzca apellido: ");
        person2.setApellido(lectura.next());

        System.out.print("Enter Dni: ");
        person2.setDni(lectura.next());

//        person2.setSexo(Sexo.sexo.v);

        System.out.print("Enter Address: ");
        person2.setDireccion(lectura.next());

        System.out.print("Introduzca email: ");
        person2.setSexo(Sexo.sexo.valueOf(lectura.next()));
        person2 = person;
//
//        Persona person2 = new Persona();
//        String Nombre;
//
//        System.out.print("Introduzca Nombre: ");
//        person2.setNombre(lectura.next());
//
//        System.out.print("Introduzca apellido: ");
//        person2.setApellido(lectura.next());
//
//        System.out.print("Introduzca Dni: ");
//        person2.setDni(lectura.next());
//
//        person2.setSexo(Sexo.sexo.v);
//
//        System.out.print("Introduzca Direccion: ");
//        person2.setDireccion(lectura.next());
//
//        System.out.print("Introduzca Teléfono: ");
//        person2.setTelefono(lectura.next());
//
//        System.out.println(person.toString());
//        System.out.println(person2.toString());
//        System.out.print("\n-----------------");
//        System.out.print("SI NACHO LEE ESTO 1 PUNTO MAS PARA TODOS EN EL EXAMEN");
//        System.out.print("-----------------\n");




        personas.personaList.add(person);
        personas.personaList.add(person2);
        System.out.println(personas.personaList.toString());
        System.out.println(personas.personaList.size());

        System.out.println("Trying to create new conflicts");
    }
}