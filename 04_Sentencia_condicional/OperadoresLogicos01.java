/**
 * Operadores lógicos
 *
 * @author Luis J. Sánchez
 */

public class OperadoresLogicos01 {
  public static void main(String[] args) {
    System.out.println("Adivina el número que estoy pensando.");
    System.out.print("Introduce un número entre el 1 y el 100: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );

/** se introduce un numero y se controla que no sea menor que 1 y mayor
 * que 100 para que este en este rango.
 * Si pusiesemos un 50 seria falso y falso por lo tanto se salta esta
 * sentencia
 */
    if ((n < 1) || (n > 100)) {
      System.out.println("El número introducido debe estar en el intervalo 1 - 100.");
      System.out.print("Tienes otra oportunidad, introduce un número: ");
      linea = System.console().readLine();
      n = Integer.parseInt( linea );
    }   
  
    if (n == 24) {
      System.out.println("¡Enhorabuena!, ¡has acertado!");
    } else {
      System.out.println("Lo siento, ese no es el número que estoy pensando.");
    }
  }
}
