
package recursividad;

/**
 *
 * @author fvp
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     * Recursividad en Java
     * Es la tecnica que permite que un bloque de instrucciones se ejecute "n" veces.
     * 
     * Logramos las estructuras repetitivas en bloques que podemos ejecutar varias veces.
     * 
     * En Java, los metodos pueden hacer un llamado a ellos mismos, esto posibilita que el metodo 
     * se invoque a El mismo las veces necesite ejecutarse.
     */
    
    public void Imprimir(int x){ //Metodo Recursivo* que muestra numeros consecutivos menores a 5
        if(x <= 5){
            System.out.print(x + "  ");  //mostrar por pantalla y concatena espacio
            Imprimir(x + 1); //Llama nuevamente Metodo Recursivo* (Accion Recursiva)
        }
    } //OUT> 0  1  2  3  4  5
    



///Realice Un metodo que SUME recursivamente un mismo numero, 
//un numero determinado de veces.
    public static int SumaRecursiva(int x, int itera){
        int rest=0;
        
        for(int i=0; i<itera; i++){
            rest=x+SumaRecursiva(x,itera-1);
            System.out.println(x + ",  ");
        }
        return rest;
    }

// Realice un algoritmo que guarde una serie numeros en un arreglo de
//  10POS y le solicite al usuario si desea mostrar el arreglo
// o si desea eliminar el arreglo
// Utilizando Recursividad

    
// >> Ingrese el numero que desea almacenar en la posicion 1:
// >> Ingrese el numero que desea almacenar en la posicion 2:
// >> ..... hasta la posicion 10
    
// >> Presione 1 para mostrar el arreglo y presione 2 para eliminarlo.
}
