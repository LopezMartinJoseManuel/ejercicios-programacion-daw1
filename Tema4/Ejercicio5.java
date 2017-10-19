/**Ejercicio 5 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio5 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula esta ecuacion ax+b=0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
	System.out.print("Por favor, introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
	
	if (a == 0){
	System.out.println("No tiene solucion real");	
	}
	else{
	double solucion = -b/a;
	System.out.printf("El resultado de x es : %.2f",solucion);
	}
	

}
}
