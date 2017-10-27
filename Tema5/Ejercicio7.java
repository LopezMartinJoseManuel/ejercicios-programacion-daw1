/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio7 {
    public static void main(String[] args) {
      
      // la combinacion es 3 7 4 2
      
      System.out.println("Te encuentras ante una caja fuerte y no sabes la combinación");
      System.out.println("Pero sientes que hoy es tu dia de suerte, ¿Por qué no probar?");
      for (int i = 1; i <= 4; i++) {
        System.out.print("Introduce el numero: ");
        int n1 = Integer.parseInt(System.console().readLine());
                
        if (n1 == 3742){
          System.out.println("Contraseña correcta!");
          System.out.println("Pero esto es solo un programa, ¿Qué esperabas?");
          i = 5;
        }
        else {
          System.out.println("Contraseña incorrecta " + (4 - i) + " intentos restantes");
          
        }
        
      }
   }
}
