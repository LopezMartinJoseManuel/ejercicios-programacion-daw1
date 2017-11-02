/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * Ejercicio 10
 * 
 * @author Jose Manuel López Martín
 */

public class Ejerciciocuadrado {
    public static void main(String[] args) {
    
    double numero = 0;
    double aumento = 0;
    double suma = 0; 
    System.out.println("Programa que calcula la media de los numeros introducidos");
    System.out.println("Para parar el programa introduzca un número negativo");    
    
      
    while (numero >= 0){
    numero = Integer.parseInt(System.console().readLine());
    aumento++;
    // se recoge el numero y el primero se suma a 0 y el resto al anterior.
    suma += numero;
      }
    // Al hacer esto quitamos el ultimo número a la suma y a el aumento.
    double sumaFinal = suma - numero;
    double aumentoFinal = aumento - 1;
    double calculoFinal = sumaFinal / aumentoFinal;
    
    System.out.print("La media de los numeros es: " + calculoFinal);  
    
  }
}
