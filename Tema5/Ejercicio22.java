/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. 
 * 
 * Ejercicio 22
 * @author José Manuel López Martín
 */

//preguntar profe
public class Ejercicio22 {
  public static void main(String[] args) {
    boolean primo = true;
    int i;
    int j;
    System.out.println("Programa que calcula los numeros primos entre 2 y 100");
    for (i = 2; i <=100; i++){
      primo = true;
      for (j = 2; j < i; j++) {
        if (i % j == 0) {
          primo = false;
        }
      }
          
      if (primo) {
        System.out.println("Numero: " + i);
      } 
    }
    System.out.println("Numero: " + (i -1));
  }
}

