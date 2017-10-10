/**Ejercicio 4 Tema 3
*  Escribe un programa que sume, reste, multiplique y divida dos números
*  introducidos por teclado.
*
* @author Jose Manuel Lopez Martin
*/

public class Ejercicio4 {
  public static void main(String[] args) {

    String linea;
	System.out.println("Programa calculador de 2 datos");
	System.out.println("Se realizara suma, resta, multiplicacion y división");
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int suma = primerNumero + segundoNumero;
    int resta = primerNumero - segundoNumero;
    int multiplicacion = primerNumero * segundoNumero;
    double division = (double) primerNumero / (double) segundoNumero;
    

    System.out.println("La suma de los números es: " + suma);
    System.out.println("La resta de los números es: " + resta);
    System.out.println("La multiplicación de los números es: " + multiplicacion);
    System.out.println("La división de los números es: " + division);
   
  } 
}
