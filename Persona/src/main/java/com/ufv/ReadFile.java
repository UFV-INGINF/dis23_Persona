package com.ufv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    static String line = "";
    static String splitBy = ",";

        //parsing a CSV file into BufferedReader class constructor
        static BufferedReader br;


        public static ArrayList<Persona> readFile() {

            ArrayList<Persona> lista = new ArrayList<>();
            try {
                br = new BufferedReader(new FileReader("agenda.csv"));
                br.readLine();
                while ((line = br.readLine()) != null)
                //returns a Boolean value
                {
                    String[] persona = line.split(splitBy);
                    Persona person = new Persona();
                    person.setNombre(persona[0]);
                    person.setApellido(persona[1]);
                    person.setDni(persona[2]);
                    person.setSexo(Sexo.sexo.valueOf(persona[3].replaceAll("\\s+","").toLowerCase()));

                    lista.add(person);
                    //use comma as separator
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return lista;


        }



}
