/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Dog {
    private String nombre;
    private double tamaño;
    private int identificador;
    public static int numerodePerroscreados=0;
    //método por defecto
    public Dog() {
        //cada vez que se crea un objeto se se incrementa numerodePerroscreados
        numerodePerroscreados++;
        //se asigna el identificador con el valor actual de numerodePerroscreados
        identificador=numerodePerroscreados;        
    }
    //constructor full
    public Dog(String nombre, Double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;         
        numerodePerroscreados++;
        identificador=numerodePerroscreados;
    }   
    public int getId() { // retorna el Identificador.
        return identificador;
    }
}
