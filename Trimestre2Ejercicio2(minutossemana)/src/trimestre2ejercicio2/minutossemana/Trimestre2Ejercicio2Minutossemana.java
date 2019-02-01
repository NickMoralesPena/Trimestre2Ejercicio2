/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre2ejercicio2.minutossemana;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Trimestre2Ejercicio2Minutossemana {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dias = null;
        System.out.println("Introduce el día: ");
        dias = entrada.nextLine().toLowerCase();
        System.out.println("Introduce la hora: ");
        String horas = entrada.nextLine();
        String[] parts = horas.split(":");
        String h = parts[0];
        String m = parts[1];
        int hora = Integer.parseInt(h);
        int minutos = Integer.parseInt(m);
        int totalminutos = (hora * 60) + minutos;
        
        if ((hora >=0 && hora <24) && minutos >=0 && minutos<60 ){
        switch (dias) {
            case "lunes":
                int fm = 6660 - totalminutos;
                System.out.println("Faltan: " + fm + " minutos para el fin de semana");
                break;
            case "martes":
                fm = 6660 - (totalminutos + 1440);
                System.out.println("Faltan: " + fm + " minutos para el fin de semana");
                break;
            case "miercoles":
                fm = 6660 - (totalminutos + (1440 * 2));
                System.out.println("Faltan: " + fm + " minutos para el fin de semana");
                break;
            case "jueves":
                fm = 6660 - (totalminutos + (1440 * 3));
                System.out.println("Faltan: " + fm + " minutos para el fin de semana");
                break;
            case "viernes":
                fm = 6660 - (totalminutos + (1440 * 4));
                System.out.println("Faltan: " + fm + " minutos para el fin de semana");
                break;
            case "sabado":
                break;
            case "domingo":
                break;
            default:
                System.out.println("Introduce un día valido");
        }
        }
        else{
            System.out.println("Hora introducida INVALIDA");
        }
    }


}
