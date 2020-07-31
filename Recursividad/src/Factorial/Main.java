
package Factorial;
import java.util.Scanner;
/**
 *
 * @author fvp
 */
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el numero que desee calcular su Factorial: ");
        int numero = entrada.nextInt();
        
        factorial Objeto = new factorial();
        int factorial = Objeto.Calcula_Factorial(numero);
        System.out.print("El factorial de " + numero + " es -> " + factorial );
    }
}
