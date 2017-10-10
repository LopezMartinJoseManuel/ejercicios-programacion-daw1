/**Ejercicio 9 Tema 3
* Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3πr2h 	
*
* @author Jose Manuel Lopez Martin
*/
 
public class Ejercicio9 {
	
	
	static final double pi = 3.141592654;
	
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula el volumen de un cono");
	System.out.println("------------------------------------------");
	System.out.print("Introduzca altura en cm: ");
	double altura = Double.parseDouble(System.console().readLine());
	System.out.print("Introduzca radio en cm: ");
	double radio = Double.parseDouble(System.console().readLine());
	double volumen = (1.0/3.0) * pi * radio * radio * altura;
	
	System.out.println("Altura dada: " + altura);
	System.out.println("-------------");
	System.out.println("Radio dado: " + radio);
	System.out.println("------------");
	System.out.printf("El calculo del volumen es: %8.2f cm3", volumen);
}
}
