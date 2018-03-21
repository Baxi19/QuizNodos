import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshib
 */
public class Metodos {
    
    Cliente fin, inicio; //Mantiene el principio de la lista
    //Singleton
    public static Metodos instance = null;
    //  constructor
    private Metodos() {
        this.inicio = null;
        this.fin = null;
       
    }
    public static Metodos getInstance(){
        if(instance == null)
            instance= new Metodos();
            return instance;
    }
    //insertar final
    public void insertarFinal(String nombre, int edad) {
        // Se instancia un nuevo cliente
        Cliente nuevo = new Cliente(edad, nombre);
        //verifica si la lista esta vacia
        if (this.inicio == null) {
            //inserto cliente
            this.fin = this.inicio = nuevo;
            return;
        }

        if (buscarSimple(nombre) != null) {
            return;
        }

        nuevo.sig = this.fin;
        this.fin = nuevo;
        

    }
    // insertar al inicio
    public void insertarInicio(String nombre, int edad) {
        // Se instancia un nuevo cliente
        Cliente nuevo = new Cliente(edad, nombre);
        //verifica si la lista esta vacia
        if (this.inicio == null) {
            //inserto cliente
            this.fin = this.inicio = nuevo;
            return;
        }

        if (buscarSimple(nombre) != null) { 
            return;
        }

        nuevo.sig = this.inicio;
        this.inicio = nuevo;
        

    }
    public Cliente buscarSimple(String nombre){
        
        Cliente aux = inicio;
        
        while(aux != null){
            if(aux.nombre.equals(nombre))  {
                return aux;
            }
            aux = aux.sig;}
        return null;  
        
    }
    //arreglar metodo
    public void contarEdad(String edad) {
        Cliente temp = inicio;
        int cont = 0;
        while (temp != null) {
            if (Integer.toString(temp.edad).equals(edad)) {
                    cont ++;
                    
                }
            temp = temp.sig;
               
                
            }
            System.out.println("Cantidad de nombres con esa edad: " + cont);
    
        }
        
        
    
            

    public void eliminarCliente(String nombre) {
        Cliente temp = inicio;
        Cliente tempAnt = null;
        while (temp != null) {
            if (temp.nombre.equals(nombre)) {
                if (tempAnt == null) {
                    inicio = temp.sig;
                    return;
                }
                tempAnt.sig = temp.sig;
                return;
            }
            tempAnt = temp;
            temp = temp.sig;

        }

    }
    public boolean modificarSimple(String nombre,int nuevaEdad){
        Cliente aux = buscarSimple(nombre);
        if(aux != null){
            
           aux.edad = nuevaEdad;
           return true;
        }
        return false;    
    }
   
}
