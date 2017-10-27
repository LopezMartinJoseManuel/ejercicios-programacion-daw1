/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 *
 * @author Jose Manuel López Martin
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
        
    for (int i = 0; i < 100; i++) {
      int calculo = i*5;
        if(calculo <= 100){
          System.out.println(calculo);
        }
        
    /** forma mas sencilla
     *  for(int i = 0; i <= 100; i += 5) {
        System.out.println(i);
        * 
        * }
     */
    }
  }
}
