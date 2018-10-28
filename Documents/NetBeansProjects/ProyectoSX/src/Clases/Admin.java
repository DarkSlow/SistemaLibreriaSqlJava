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
public class Admin 
{
    private String nombre;
    private String dni;
    
    public Admin()
    {
       nombre = null;    
       dni = null;    
    }
    public Admin(String nombre, String dni)
    {
         this.nombre = nombre;
         this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Admin{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
