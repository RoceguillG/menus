/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("[IPC1]Tarea3_201602749");
        System.out.println("Ingrese Número de la Opción a Eligir del Menú");
        System.out.println("\t1. USUARIOS");
        System.out.println("\t2. CONTADOR DE DÍGITOS REPETIDOS");
        System.out.println("\t3. TRES NÚMEROS DE MAYOR A MENOR");
        System.out.println("\t4. CALCULAR PROMEDIO");
        System.out.println("\t5. SALIR");

        int menu = teclado.nextInt();
        switch (menu) {

            case 1:

                System.out.println(" USUARIOS  ");

                break;

            case 2:

                System.out.println(" CONTADOR DE DÍGITOS REPETIDOS ");

                break;

            case 3:

                System.out.println("TRES NÚMEROS DE MAYOR A MENOR");

                break;
            case 4:

                System.out.println("CALCULAR PROMEDIO ");

                break;
            case 5:

                System.out.println(" SALIR");

                break;

            default:
                System.out.println("POR FAVOR INGRESE UN NUMERO DEL MENU");
                break;

        }
    }

}
