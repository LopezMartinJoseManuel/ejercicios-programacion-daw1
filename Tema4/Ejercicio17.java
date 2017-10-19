/**
 * Ejercicio 17
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio17 {
	public static void main(String[] args) {

    System.out.println("Programa que muestra la ultima cifra de un numero entero");
	int numero = Integer.parseInt(System.console().readLine());
	
	int ultimoNumero = numero % 10;
	System.out.println("El Último digito es: " + ultimoNumero);
}
}
