package actividad3;

public class ListaCaracteresApp {

	public static void main(String[] args) {
		//Muestra los numeros segun el codigo Ascci 
		String cadena = "La lluvia en Sevilla es una maravilla";

		for (int i = 0; i < cadena.length(); i++) {
			System.out.print((int)cadena.charAt(i) + " ");
		}
	}

}
