package actividad7;

import javax.swing.JOptionPane;

public class Ejercicio_basicos_DDR_30_v2 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog(null, "Por favor, introduce una frase", "Introduccion", JOptionPane.INFORMATION_MESSAGE);
		
		String cadenaResultante;
		
		boolean isMayus;
		
		int	eleccion = JOptionPane.showConfirmDialog(null, "Quieres que se pase a mayusculas?", "Eleccion", JOptionPane.YES_NO_OPTION);
		
		isMayus = (eleccion == JOptionPane.YES_NO_OPTION);
		
		if (isMayus) {
			cadenaResultante = texto.toUpperCase();
		}
		else {
			cadenaResultante = texto.toLowerCase();
		}
		
		JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
