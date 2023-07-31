
package ejercicio_29.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor ingresa el primer valor: ");
        num1 = entrada.nextInt();
        
        System.out.print("Por favor ingresa el segundo valor: ");
        num2 = entrada.nextInt();
        
        if(num1 == num2){
            System.out.println("Los valores ingresados son iguales");
        }else{
            System.out.println("Los valores no son iguales");
        }
        }
    
}
