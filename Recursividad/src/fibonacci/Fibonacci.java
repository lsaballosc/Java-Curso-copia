
package fibonacci;

/**
 *
 * @author fvp
 */
public class Fibonacci { // Corregir el metodo recursivo para que muestre numeros Fibonacci
    // Numero F:  0,1,1,2,3,5,8,13,21,34,55,89,144,233.
    // Fn = Fn-1 + Fn-2
//   public void CalculaFn(int f0, int f1){
//       int fn=f0+f1;
//       if( f1==1 && f0==0){
//           System.out.print(f0 + "-> ");
//           System.out.print(f1 + "-> ");
//       }
//       if( fn <= 233){
//           System.out.print(fn + "-> ");
//           //CalculaFn(,);
//           }
//   }// OUT>  
    
public int CalcularFib(int numero){
    if(numero == 0){
        return 0;
    }else if(numero == 1){
        return 1;
}else return CalcularFib(numero-1) + CalcularFib(numero-2);
    
    
//    return numero;
}    
}
