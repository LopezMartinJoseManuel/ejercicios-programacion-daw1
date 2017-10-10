/**Ejercicio 2 Tema 3
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio2 {
  public static void main(String[] args) {
	
	System.out.println("Este programa es un conversor de € a pts");
	System.out.print("Introduzca una cantidad en €: ");
	
	double euros = Double.parseDouble(System.console().readLine());
	
	double pesetas = 166.30;
	
	int conversor = (int) euros * (int) pesetas;
	
	System.out.println(euros + "€ cambiados a pesetas son " + conversor + " pesetas");

}
}
