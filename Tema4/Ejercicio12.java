/**
 * Ejercicio12 
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio12 {
  public static void main(String[] args) {  
	   
    int puntuacion = 0;
    
    System.out.println("Cuestionario Daw1");
    System.out.println("Responde siempre con 1 o 2");
    System.out.println("1º Pregunta:");
    System.out.println("¿Qué tal lleváis levantaros temprano despues del verano?");
    System.out.println("1: Perfecto, me levanto como una rosa. ");
    System.out.println("2: Fatal se me quedan pegadas las sabanas :S. ");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta1 = Integer.parseInt(System.console().readLine());  
     
    System.out.println("2º Pregunta:");
    System.out.println("Ahora en serio, ¿Cómo lleváis por ahora el curso?");
    System.out.println("1: Creo que bien, pero Eva habla muy rápido.");
    System.out.println("2: uff muy chungos los ejercicios de Programación.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("3º Pregunta:");
    System.out.println("Venga ahora preguntas serias de verdad.");
    System.out.println("¿Con que comando se imprime caracteres por pantalla?");
    System.out.println("1: Public class");
    System.out.println("2: System.out.print ");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta3 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("4º Pregunta:");
    System.out.println("¿Cuál de estas dos etiquetas sirve para poner negrita un texto?");
    System.out.println("1: <strong>");
    System.out.println("2: <blackquote> ");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta4 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("5º Pregunta:");
    System.out.println("¿Cual de estas dos cardinalidades no es correcta?");
    System.out.println("1: C,N");
    System.out.println("2: 1,N" );
    System.out.print("Respuesta (1-2)=> ");
    int respuesta5 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("6º Pregunta:");
    System.out.println("¿Cómo se pasan mb a kb?");
    System.out.println("1: Multiplicando el nº x 1024.");
    System.out.println("2: Dividiendo el nº / 1024.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta6 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("7º Pregunta:");
    System.out.println("¿Qué significa en java int?");
    System.out.println("1: Numero entero.");
    System.out.println("2: Numero decimal.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta7 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("8º Pregunta:");
    System.out.println("¿Que tipo de datos podemos incluir en VARCHAR");  
    System.out.println("1: Solo caracteres.");
    System.out.println("2: Alfanuméricos.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta8 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("9º Pregunta");
    System.out.println("¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("1: Double.");
    System.out.println("2: Float.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta9 = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("10º Pregunta:");
    System.out.println("¿Cuál de las siquientes opciones es un lenguaje de programación de base datos?");
    System.out.println("SQL.");
    System.out.println("SELECT.");
    System.out.print("Respuesta (1-2)=> ");
    int respuesta10 = Integer.parseInt(System.console().readLine());
    
       
	if (respuesta1 == 1){
		puntuacion++;
	}
	if (respuesta2 == 1){
		puntuacion++;
		}
	if (respuesta3 == 2){
		puntuacion++;
	}
	if (respuesta4 == 2){
		puntuacion++;
	}
	if (respuesta5 == 1){
		puntuacion++;
	}
	if (respuesta6 == 1){
		puntuacion++;
	}
	if (respuesta7 == 1){
		puntuacion++;
	}
	if (respuesta8 == 2){
		puntuacion++;
	}
	if (respuesta9 == 1){
		puntuacion++;
	}
	if (respuesta10 == 1){
		puntuacion++;
	}
	System.out.printf("\nLa puntuación que has sacado es: %d/10", puntuacion);
	if (puntuacion < 3){
		System.out.print("\nHay que mejorar la cosa :D");
	}
	else if (puntuacion <6) {
		System.out.print("\nEstas empanaill@ pero bueno esta bien");
	}
	else if (puntuacion <8) {
		System.out.print("\nEstas en la onda loc@");
	}
	else if (puntuacion <9) {
		System.out.print("\nEres una máquina");
	}
	else{
		System.out.print("\nHas sacado una nota perfecta Naisuu!! :D");
		}
	}
    }



