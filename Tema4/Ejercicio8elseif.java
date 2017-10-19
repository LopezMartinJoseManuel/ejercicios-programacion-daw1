/**Ejercicio 8 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio8elseif {
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
	else if (solucion < 6){
	System.out.println("\nLa nota es un suficiente");	
	}
	else if (solucion <7){
	System.out.println("\nLa nota es un bien");
	}
	else if (solucion <9){
	System.out.println("\nLa nota es un notable");
	}
	else {
	System.out.println("\nLa nota es un sobresaliente");
	}
}
}
