package actividad4;

import javax.swing.JOptionPane;

public class CalculadoraPolacaInversaApp {

	public static void main(String[] args) {
		//Calcula segun el operador 
		double operando1;
		double operando2;
		double resultado = 0;
		
		String texto = JOptionPane.showInputDialog("Escribe el operador 1");
		operando1 = Integer.parseInt(texto);
		
		String operacion = JOptionPane.showInputDialog("Escribe el codigo de operacion");
		
		String texto2 = JOptionPane.showInputDialog("Escribe el operador 2");
		operando2 = Integer.parseInt(texto2);
		
		switch(operacion) {
		case "+":
			resultado = operando1 + operando2;
			break;
		case "-":
			resultado = operando1 - operando2;
			break;
		case "*":
			resultado = operando1 * operando2;
			break;
		case "/":
			resultado = operando1 / operando2;
			break;
		case "^":
			resultado = (int)Math.pow(operando1, operando2);
			break;
		case "%":
			resultado = operando1 % operando2;
			break;
		}
		
		JOptionPane.showMessageDialog(null, operando1 + " " + operacion + " " + operando2 + " = " + resultado);
	}
}
