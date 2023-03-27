package actividad11;

import java.util.Scanner;

public class Ejercicio_basicos_DDR_18 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		sn.useDelimiter("\n");
		
		System.out.println("Escribe una frase");
		String frase = sn.next();
		
		String palabras[] = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
}
