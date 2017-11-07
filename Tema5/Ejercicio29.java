/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio29 {
  public static void main(String[] args) {
   
    System.out.println("Programa que muestra los numeros divisibles entre uno grande y otro pequeño");
    System.out.println("Introduzca el número grande: ");  
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un número pequeño: ");
    int numpeque = Integer.parseInt(System.console().readLine());
    for (int i = 1; i <= num; i++) {
      if (( i % numpeque) != 0){
        System.out.println(i + " no es divisible entre " + num);
        }
    }

   
}
}

