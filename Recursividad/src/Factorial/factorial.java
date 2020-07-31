/*
 * El factorial es un valor que se obtiene com resultado de la multiplicacion
 * de todos los numeros que le anteceden al numero del cual se desea conocer 
 * su factorial a excepcion del 0 (Zero)
 */

// Para obtener el Factorial de un numero, se multiplican todos los numeros 
// que van desde 1 hasta el numero ingresado.
package Factorial;

/*
 * Desarrolle un programa que calcule el factoral de un numero X : n!
 * 6! = 6*5*4*3*2*1 = 720
 * @author fvp
 */
public class factorial {
    public int Calcula_Factorial(int Num){
        if(Num > 0){
            int valor_calculado = Num * Calcula_Factorial(Num - 1); // 5*4*3*2*1
            return valor_calculado;
        }
        return 1;// retorna -1 en caso de error
    }
}
