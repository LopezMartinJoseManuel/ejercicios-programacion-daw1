/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * Factorial de 6 = 6*5*4*3*2*1
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio28 {
  public static void main(String[] args) {
   
    System.out.println("Programa que calcula el factorial de un numero ");
    System.out.print("Introduzca el número: ");  
    int num = Integer.parseInt(System.console().readLine());
    
    int factorial = num;
    int nummenos = num -1;
    while (nummenos >0){
      factorial *= nummenos;
      nummenos--; 
    }

    System.out.println("6! = " + factorial);
}
}
