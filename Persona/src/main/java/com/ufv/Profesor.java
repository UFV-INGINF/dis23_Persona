package com.ufv;

public class Profesor extends Persona{
    private String ID_Profesor;

    public Profesor(String nombre, String apellidos, String dni,String direccion, String telefono, String ID_Profesor) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.ID_Profesor = ID_Profesor;
    }

    public Profesor() {
        super();
    }

    public String getID_Profesor() {
        return ID_Profesor;
    }

    public void setID_Profesor(String ID_Profesor) {
        this.ID_Profesor = ID_Profesor;
    }

    public String toString() {
         String res = super.toString();
         return res + ", ID Profesor= " + ID_Profesor + '\n' +
                '}';
    }
}
