/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshib
 */
public class Cliente {

    int edad;
    String nombre;
    Cliente sig;
    
//constructor

    public Cliente(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        sig = null;
    }
//get 

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getSig() {
        return sig;
    }
// set

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSig(Cliente sig) {
        this.sig = sig;
    }

}
