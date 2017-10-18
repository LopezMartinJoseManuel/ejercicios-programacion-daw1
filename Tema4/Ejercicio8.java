/**Ejercicio 8 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio8 {
	public static void main (String [] args) {
		
	System.out.println("Programa que calcula la media de 3 notas");
    System.out.print("Por favor, introduzca nota nº1: ");
    double nota1 = Double.parseDouble(System.console().readLine());
	System.out.print("Por favor, introduzca nota nº2: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca nota nº3: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    
	double solucion = (nota1 + nota2 + nota3) / 3;
	System.out.printf("\nEl resultado de la nota media es : %.2f", solucion);
	
	if(solucion <5){
	System.out.println("\nLa nota es un insuficiente");
	}
	if((solucion >= 5) && (solucion < 6)){
	System.out.println("\nLa nota es un suficiente");	
	}
	if((solucion >= 6) && (solucion <7)){
	System.out.println("\nLa nota es un bien");
	}
	if((solucion >= 7) && (solucion <9)){
	System.out.println("\nLa nota es un notable");
	}
	if(solucion >=9){
	System.out.println("\nLa nota es un sobresaliente");
	}
}
}
