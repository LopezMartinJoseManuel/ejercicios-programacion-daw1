/**Ejercicio 5 Tema 3
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Jose Manuel Lopez Martin
* 
*/

public class Ejercicio5 {
  public static void main(String[] args) {

    String linea;
	System.out.println("Programa que calcula la base de un Rectángulo");
    System.out.print("Por favor, introduzca base en cm: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora, introduzca la altura en cm: ");
	int altura = Integer.parseInt(System.console().readLine());

    int area = base * altura;
    

    System.out.println("La base del rectángulo es: " + base);
    System.out.println("La altura del rectángulo es: " + altura);
    System.out.print("El area del rectángulo es: " + area);
   
  } 
}
