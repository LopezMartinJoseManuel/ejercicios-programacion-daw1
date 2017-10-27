/**
 * Ejercicio 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for .
 *
 * @author Jose Manuel Lopez Martin
 */
public class Ejercicio4 {
  public static void main(String[] args) {
                                //en esta parte se pueden hacer operaciones
    for (int i = 320; i >= 160; i++) {
      
      System.out.println(i);
      i--;
      i -= 20;
    }
  }
}
