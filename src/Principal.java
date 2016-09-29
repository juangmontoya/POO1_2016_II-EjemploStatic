/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Principal {
    public static void main(String[] args) {        
        //se llama la variable estatica sin tener que crear un objeto.
        System.out.println("Perros creados:"+Dog.numerodePerroscreados);
        Dog fido=new Dog();
        Dog spot=new Dog("Spot", 10.0);
        Dog coco=new Dog("Coco", 8d);//8d significa que 8 es un valor decimal, no un int
        
        //cualquier objeto de Dog puede acceder a la variable numerodePerroscreados
        System.out.println("Perros creados dice Coco:"+coco.numerodePerroscreados);
        System.out.println("Perros creados dice Spot:"+spot.numerodePerroscreados);
        System.out.println("El identificador de Fido es:"+fido.getId());
        
        //cualquier objeto de Dog puede cambiar el valor de numerodePerroscreados por ser static
        fido.numerodePerroscreados=100;
        System.out.println("Perros creados dice Spot:"+spot.numerodePerroscreados);
        Dog.numerodePerroscreados=200;
        
        //se llama un método estatico de la clase Math, 
        //sin tener que crear un objeto de tipo Math        
        System.out.println("Raiz cuadrada de 9:"+Math.sqrt(9));        
    }    
}
