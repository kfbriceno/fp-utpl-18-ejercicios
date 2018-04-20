/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Crear un programa que permita ingresar una calificacion por teclado, si la calificacion
ingresada es mayor o igual a 5 y la calificacion es menor a 10, se debe presentar un mensaje 
que diga usted esta en supletorios.
Delo contrario se presenta un mensaje con el valor de la calificacion dividido para dos.
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploSeleccion {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificacion");
        calificacion = entrada.nextInt();
        
        if (calificacion>=5 && calificacion<10){
            System.out.println("Usted esta en supletorio");
            
        }else{
            double resultado= calificacion/2;
            
            System.out.println( resultado);
        }
        
    }
}
