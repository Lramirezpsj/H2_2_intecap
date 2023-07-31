
package ejercicio_29.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio4 {

    public static void main(String[] args) {

        int num1, num2, num3 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por Favor digita el primer valor: ");
        num1 = entrada.nextInt();
        System.out.print("Por Favor digita el segundo valor: ");
        num2 = entrada.nextInt();
        System.out.print("Por Favor digita el tercer valor: ");
        num3 = entrada.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2);
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num1);
                }
            } else {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }

        }

    }

}
