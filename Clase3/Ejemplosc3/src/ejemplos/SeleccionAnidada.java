/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        String nombre;
        double calificacion;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresar el nombre");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la calificacion");
        calificacion= entrada.nextDouble();
        

        if (calificacion >= 90 && calificacion<=100) {
            System.out.printf("Estudiante usted esta aprobado con %d\n",nombre, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Estudiante", nombre ,"usted esta aprobado con %d\n", calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Estudiante", nombre ,"usted esta aprobado con %d\n", calificacion);

                } else {
                    System.out.printf("Estudiante", nombre ,"usted esta reprobado con %d\n", calificacion);
                }
            }
        }
    }
}
