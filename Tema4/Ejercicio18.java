/**
 * Ejercicio 18
 *
 * @author Jose Manuel Lopez
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    int numero;
    int primerCaso;
    System.out.println("Programa que recorta a un numero a su primera cifra");
    System.out.print("Introduce un número entero de hasta 5 cifras: ");
    numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( numero < 10 ){ // el numero tiene una cifra
      primerCaso = numero;
      System.out.println("La primera cifra del número es: " + primerCaso);
    }
    
    else if (( numero >= 10 ) && ( numero < 100 )){
      primerCaso = numero / 10;
      System.out.println("La primera cifra del número es: " + primerCaso);
    }
    
    else if (( numero >= 100 ) && ( numero < 1000 )){
      primerCaso = numero / 100;
      System.out.println("La primera cifra del número es: " + primerCaso);
    }
    
    else if (( numero >= 1000 ) && ( numero < 10000 )){
      primerCaso = numero / 1000;
      System.out.println("La primera cifra del número es: " + primerCaso);
    }
    
    else if ( numero >= 10000 ){
      primerCaso = numero / 10000;
      System.out.println("La primera cifra del número es: " + primerCaso);
    }
    else{
       System.out.println("Se debe introducir un número de 5 cifras como máximo");
        }
    
  }
}

