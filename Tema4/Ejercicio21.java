/**
 * Ejercicio 21
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio21 {
	public static void main(String[] args) {

	System.out.println("Programa que calcula la nota media del curso");
	System.out.print("¿Qué nota has sacado en el primer examen?: ");
	int nota1 = Integer.parseInt(System.console().readLine());
	System.out.print("¿Qué nota has sacado en el primer examen?: ");
	int nota2 = Integer.parseInt(System.console().readLine());

	int media = (nota1 + nota2) / 2;

	if (media >= 5){
		System.out.println("¡En horabuena, has aprobado el trimestre!");
		System.out.println("Tu nota media es: " + media);
		}
	if (media < 5){
		System.out.println("Vaya parece que ha ido mal la cosa");
		System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
		String recuperacion = System.console().readLine();
		
		if (recuperacion.equals("apto")){
			System.out.println("Resultado Apto");
			System.out.print("Tu nota de programación es: 5");
		}
		else{
		System.out.println("Resultado No Apto");
		System.out.print("Tu nota es: " + media);
		}
	}
}
}
