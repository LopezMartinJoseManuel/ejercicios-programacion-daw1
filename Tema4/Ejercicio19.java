/**
 * Ejercicio 18
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
	int digitos = 0;
    System.out.println("Programa que recorta a un numero a su primera cifra");
    System.out.print("Introduce un número entero de hasta 5 cifras: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
   	
    if ( numero < 10 ){
     digitos = 1;
     System.out.print("El numero tiene " + digitos + " digitos");
    }
    
    if (( numero >= 10 ) && ( numero < 100 )){
      digitos = 2;
      System.out.print("El numero tiene " + digitos + " digitos");
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )){
      digitos = 3;
      System.out.print("El numero tiene " + digitos + " digitos");
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )){
      digitos = 4;
      System.out.print("El numero tiene " + digitos + " digitos");
    }
    
    if ( numero >= 10000 ){
      digitos = 5;
      System.out.print("El numero tiene " + digitos + " digitos");
    }
    
  }
}
