/**
 * Ejercicio13 
 *
 * @author Jose Manuel Lopez Martin

 */

public class Ejercicio13 {
  public static void main(String[] args) {
	  
	System.out.println("Programa que ordena 3 numero introducidos en orden decreciente");
	System.out.print("Introduce el primer numero: ");
	int a = Integer.parseInt(System.console().readLine()); 
	System.out.print("Introduce el segundo numero: ");
	int b = Integer.parseInt(System.console().readLine()); 
	System.out.print("Introduce el tercer numero: ");
	int c = Integer.parseInt(System.console().readLine()); 

	if (( a <= b ) && ( a <= c )){
		if( b <= c ){
		 System.out.print("El orden seria " + a + " después " + b + " y por ultimo " + c );
		}
	  else {
	  System.out.print("El orden seria " + a + " después " + c + " y por ultimo " + b );
		  }
	}	  
		  
	if (( b <= a ) && ( b<=c )){
		if( a <= c){
		 System.out.print("El orden seria " + b + " después " + a + " y por ultimo " + c );
		}
		else{
		 System.out.print("El orden seria " + b + " después " + c + " y por ultimo " + a );
		}
	}
	
	if (( c <= a ) && ( c<= b )){
		if( b <= a){
		 System.out.print("El orden seria " + c + " después " + b + " y por ultimo " + a );
		}
		else{
		 System.out.print("El orden seria " + c + " después " + a + " y por ultimo " + b );
		}
	}
}
}
