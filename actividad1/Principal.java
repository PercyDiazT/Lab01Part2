package actividad1;

public class Principal {

	public static void main(String[] args) {
		//Cuenta las vocales de toda la cadena 
		
		String cadena = "La lluvia en Sevilla es una maravilla";
		
		int contador = 0;
		for (int i = 0; i < cadena.length(); i ++) {
			if (cadena.charAt(i) == 'a' ||
					cadena.charAt(i) == 'e' ||
					cadena.charAt(i) == 'i' ||
					cadena.charAt(i) == 'o' ||
					cadena.charAt(i) == 'u') {
				contador++;
			}
		}

		System.out.println("Hay " + contador + " vocales");
	}

}
