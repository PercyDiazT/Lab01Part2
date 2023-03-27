package Ejercicio1Part1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Ingrese los alumnos");
		String arrNombres[] = texto.split(",");
		String alumnoBuscar = JOptionPane.showInputDialog("Ingrese el alumno a buscar");
		boolean opc = false;
		for (int i = 0; i < arrNombres.length ; i++) {
			if (alumnoBuscar.equals(arrNombres[i])) {
				opc = true;	
			}
		}
		if(opc) {
			JOptionPane.showMessageDialog(null,"Se encontro el alumno");
		}
		else {
			JOptionPane.showMessageDialog(null,"El alumno no esta en lista");			
		}
	}
}
