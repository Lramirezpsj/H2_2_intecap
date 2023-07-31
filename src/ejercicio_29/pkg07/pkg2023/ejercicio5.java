/*
 * el año divisible entre 4 es año bisiesto, exceto los divisibes entre 100
 * Los divisibles por 100 tambien deben ser divisibles por 400
 */
package ejercicio_29.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio5 {

    public static void main(String[] args) {

        int dia, mes, ano, contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingresa el dia: ");
        dia = entrada.nextInt();
        System.out.print("Por favor ingresa el mes: ");
        mes = entrada.nextInt();
        System.out.print("Por favor ingresa el año: ");
        ano = entrada.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

            contador = 1;

        }

        if (contador < 1) {
            if (mes == 2 && dia > 28) {
                System.out.println("");
                System.out.println("error, el año " + ano + " no es bisiesto, el dia tiene que ser menor a 29");
            } else if (mes == 5 && dia > 30) {
                System.out.println("");
                System.out.println("Error, el año " + ano + " no es bisiesto, el dia tiene que ser menor a 31");
            } else if (mes > 12) {
                System.out.println("");
                System.out.println("Error, el mes no puede ser mayor a 12");
            } else if (dia > 31) {
                System.out.println("");
                System.out.println("Error, el dia no puede ser mayor a 31");
            } else {
                System.out.println("");
                System.out.println("La fecha es correcta: ");
            }

        }

    }
}
