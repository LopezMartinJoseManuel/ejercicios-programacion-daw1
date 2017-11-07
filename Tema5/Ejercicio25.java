/**
 * Ejercicio 25
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio25 {
  public static void main(String[] args) {
  int volt = 0;
  System.out.println("Programa que muestra el nº el revés");
  System.out.print("Introduzca el número: ");  
  int num = Integer.parseInt(System.console().readLine());

  
    while (num > 0) {
      // 0 = 0 * 10 + numerointrucido %10
      // esto hace "aumentar el hueco de volt" e ir cogiendo el ultimo nº del intro
      volt = (volt * 10) + (num %10);
      // esta linea quita el ultimo nº al intro
      num /= 10;
      
    }
  System.out.print("El nº volteado sería: " + volt);
      
}
}
