/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * Ejercicio 21
 * 
 * @author Jose Manuel López Martín
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    double numero = 0;
    int aumento = 0;
    double suma = 0;
    double aux = 0;
    double calculoFinal = 0;
    double cuentaImpares = 0;
    System.out.println("Programa que calcula la media de los numeros doubleroducidos");
    System.out.println("Para parar el programa doubleroduzca un número negativo");    
    
      
    while (numero >= 0){
    numero = Double.parseDouble(System.console().readLine());
    aumento++;
      if (numero %2 == 0){
        if (numero > aux){
          aux = numero;
        }
      } 
      if (numero %2 != 0){
        suma +=numero;
        cuentaImpares++;
        
      }
    }
    double sumaFinal = suma - numero;
    double aumentoFinal = cuentaImpares - 1;
    calculoFinal = sumaFinal / aumentoFinal;
    System.out.println("Numeros introducidos: " + aumento);
    System.out.println("La media de los impares es: " + calculoFinal);
    System.out.println("El número par mayor es: " + aux);
   
  }    
}


