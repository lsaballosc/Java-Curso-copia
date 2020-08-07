package fibonacci;

/**
 *
 * @author fvp
 */
public class Main {
//    int f0=0;
//    int f1=1;
    public static void main(String[] args){
        Fibonacci F_n = new Fibonacci();
        for (int i=0; i<14; i++){
            System.out.println(F_n.CalcularFib(i)+",  ");
        }
    }
}
