/**Ejercicio 6 Tema 3
* Escribe un programa que calcule el área de un triángulo.
*
* @author Jose Manuel Lopez Martin
*/

public class Ejercicio6 {
  public static void main(String[] args) {

	System.out.println("Programa que calcula la base de un Triángulo");
    System.out.print("Por favor, introduzca base en cm: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora, introduzca la altura en cm: ");
	int altura = Integer.parseInt(System.console().readLine());

    int area = (base * altura) / 2;
    

    System.out.println("La base del Triángulo es: " + base);
    System.out.println("La altura del Triángulo es: " + altura);
    System.out.print("El area del Triángulo es: " + area);
   
  } 
}
