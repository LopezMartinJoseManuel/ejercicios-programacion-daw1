/**
 * Ejercicio 26
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio26 {
  public static void main(String[] args) {
    
    int volt = 0;
    int posicion = 1;
    System.out.println("Programa que calcula la posicion de un numero dentro de otro dado");
    System.out.print("Introduzca el número original: ");  
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un nº contenido en el anterior y le diré la posición: ");  
    int numpos = Integer.parseInt(System.console().readLine());
    
    //si el nº introducido es 0 la posicion sera 1 si o si
    if (num == 0){
    System.out.print("La posición del nº " + numpos + " es " + posicion);
    }
    // si el nº es > 0 le damos la vuelta, aqui entraria 1234
    while (num > 0) {
      volt = (volt * 10) + (num %10);
      num /= 10;
    }
    // aqui seria ahora 4321
    // vamos comparando el nº intro con el ultimo
    // hasta que demos con el y aumentamos la var posicion para mostrarlo.
    while (volt >0){
      if ((volt %10) == (numpos)){ // 1 = numpos?
      System.out.print("La posicion del nº " + numpos + " es " + posicion);
      }
      volt /= 10; // le vamos quitando numeros
      posicion++;
    }

    
}
}
