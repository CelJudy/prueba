/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asesoria;

/**
 *
 * @author celju2
 */
public class Asesoria {
    //comentario
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimir();
        
        Clase1 objClase1=new Clase1();
        objClase1.imprimir("hola jesi");
        
        Clase3 objClase3=new Clase3();
        objClase3.entero=5;
        objClase1.imprimir(Integer.toString(objClase3.entero));
        
        Clase3 objClase3v2=new Clase3();
        objClase3v2.entero=10;
        
        objClase3.sumar(objClase3.entero, objClase3v2.entero);
        
        
    }
    
    static public void imprimir(){
        System.out.println("Hola mundo");
    }
    
    static public String concatenar(){
        return "Hola mundo";
    }
    
    static public int sumar(int numero1){
        return numero1++;
    }
    static public int restar(int numero1){
        return numero1--;
    }
    
}
