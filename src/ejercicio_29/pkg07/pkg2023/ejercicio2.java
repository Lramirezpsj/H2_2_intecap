
package ejercicio_29.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio2 {
    public static void main (String [] args){
    
        int num1 = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("POr favor ingresa el valor: ");
        num1 = entrada.nextInt();
        
        if(num1 < 0){
        
        System.out.println("el vaor digitado es negativo");
        
    } else if(num1 > 0){
            System.out.println("El valor digitado es positivo");
    }
    }            

}
