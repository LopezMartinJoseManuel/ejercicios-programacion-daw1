/**
 * Ejercicio16 
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio16 {
  public static void main(String[] args) {  
	   
    int puntuacion = 0;
    System.out.println("¿Tu pareja te esta siendo infiel?");
    System.out.println("Averigualo con nuestro test amoroso Computer Lover <3");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta1 = System.console().readLine(); 
     
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta2 = System.console().readLine(); 
    
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta3 = System.console().readLine();  
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta4 = System.console().readLine(); 
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta5 = System.console().readLine();  

    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta6 = System.console().readLine();  
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta7 = System.console().readLine();  
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");  
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta8 = System.console().readLine();  
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta9 = System.console().readLine(); 
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("1: Verdadero (v)");
    System.out.println("2: Falso (f)");
    System.out.print("Respuesta=> ");
    String respuesta10 = System.console().readLine(); 
    
       
	if (respuesta1.equals("v")){
		puntuacion += 3;
	}
	if (respuesta2.equals("v")){
		puntuacion += 3;
		}
	if (respuesta3.equals("v")){
		puntuacion += 3;
	}
	if (respuesta4.equals("v")){
		puntuacion += 3;
	}
	if (respuesta5.equals("v")){
		puntuacion += 3;
	}
	if (respuesta6.equals("v")){
		puntuacion += 3;
	}
	if (respuesta7.equals("v")){
		puntuacion += 3;
	}
	if (respuesta8.equals("v")){
		puntuacion += 3;
	}
	if (respuesta9.equals("v")){
		puntuacion += 3;
	}
	if (respuesta10.equals("v")){
		puntuacion += 3;
	}
	System.out.printf("\nLa puntuación que has sacado es: %d/30", puntuacion);
	if ((puntuacion >= 0) && ( puntuacion <=10)){
		System.out.print("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
	}
	else if ((puntuacion >= 11) && ( puntuacion <=22)) {
		System.out.print("\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
	}
	else if ((puntuacion >= 23) && ( puntuacion <=30)) {
		System.out.print("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
	}

	}
	}

