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
public class Loguear {
    private String dni;
   private String pass;
   
   public Loguear()
   {
      dni = null;    
      pass = null;    
   }
   public Loguear(String dni , String pass)
   {
       this.dni = dni;
       this.pass = pass;
   }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Login{" + "dni=" + dni + ", pass=" + pass + '}';
    }
}
