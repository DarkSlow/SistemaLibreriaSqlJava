/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Simon_PC
 */
public class DatosAdm 
{
    private String dni;
    private String nombre;
    private String apellidos;
    private String edad;
    private String sexo;
    private String cargo;

    public DatosAdm(String dni, String nombre, String apellidos, String edad, String sexo, String cargo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.cargo = cargo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Usario " + "dni=" + dni + ", nombre=" + nombre + ", apellidos="
                + "" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", cargo=" + cargo;
    }
    
    
    
    
}
