/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosta_christian_e1;

import java.util.Scanner;


/**
 *
 * @author omarr
 */
public class Acosta_Christian_E1 {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Esto es para el print del menu
            System.out.print("Elija una opcion: ");
            System.out.print("1. piramide");
            System.out.print("2. el mayor");
            System.out.print("3. cajas de canal");
            System.out.print("4. caracteres de vocales");
            System.out.print("5. salir");
            int opcion = scanner.nextInt();

            //Estas son las opciones que tiene el menu para elegir
            if (opcion == 1) {
                piramide(scanner);
            } else if (opcion == 2) {
                elmayor(scanner);
            } else if (opcion == 3) {
                canalesycaja(scanner);
            } else if (opcion == 4) {
                caracteresvocales(scanner);
            } else if (opcion == 5) {
                System.out.println("Hasta luego");
                break; 
                
            } else {
                System.out.println("Opcion no valida");
            }
        }
        scanner.close();
    }

    public static void piramide(Scanner scanner) {
        //Esta es la primer opcion del Menu
        System.out.print("Ingrese la altura de su piramide: ");
        int v = scanner.nextInt();
        for (int i = 1; i <= v; i++) {
            for (int t = 1; t <= v - i; t++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= (2 * i - 1); v++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void elmayor(Scanner scanner) {
        //Esta es la segunda opcion del Menu
        int mayorque = Integer.MIN_VALUE;
        int sumado = 0;
        int cuenta = 0;

        while (true) {
            System.out.print("Ingrese un numero o -1 para terminar: ");
            int num = scanner.nextInt();
            if (num == -1) break;
            if (num > mayorque) mayorque = num;
            sumado += num;
            cuenta++;
        }

        if (cuenta > 0) {
            double promedio = (double) sumado / cuenta;
            System.out.print("El numero mayor es: " + mayorque);
            System.out.print("El promedio es: " + promedio);
        } else {
            System.out.print("No se ingresaron numeros ");
        }
    }
    
    public static void canalesycaja(Scanner scanner) {
        //Esta es la tercera opcion del Menu
        scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        int normales = 0;
        int hd = 0;
        while (true) {
            System.out.print("Ingrese tipo de canal Normal, Hd o la palabra Fin para terminar: ");
            String canal = scanner.nextLine().toUpperCase();
            if (canal.equals("Fin")) break;
            if (canal.equals("Normal")) normales++;
            else if (canal.equals("Hd")) hd++;
            else System.out.print("Canal no valido");
        }

        System.out.print("Ingrese tipo de caja, las opciones son: LightBox, HdBox y DvrBox ");
        String caja = scanner.nextLine().toUpperCase();
        int costo = 0;
        if (caja.equals("LIGHTBOX")) costo = 50;
        else if (caja.equals("HDBOX")) costo = 100;
        else if (caja.equals("DVRBOX")) costo = 150;

        int sub = normales * 20 + hd * 30 + costo;
        double impuesto = sub * 0.15;
        double total = sub + impuesto;

        System.out.print("Cliente: " + nombre);
        System.out.print("Canales normales: " + normales);
        System.out.print("Canales HD: " + hd);
        System.out.print("Subtotal: Lps " + sub);
        System.out.print("Impuesto (15%): Lps " + impuesto);
        System.out.print("Total: Lps " + total);
    }

    public static void caracteresvocales(Scanner scanner) {
        //Esta es la ultima opcion del Menu
        scanner.nextLine(); 
        System.out.print("Ingrese una cadena de texto: ");
        String cadenas = scanner.nextLine();
        int contadorvocales = 0;
        for (int i = 0; i < cadenas.length(); i++) {
            char caracter = cadenas.charAt(i);
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadorvocales++;
                    break;
                default:
                    break;
            }
        }
        System.out.print("La cantidad de vocales en la cadena es: " + contadorvocales);
    }
}