package Ejercicio1Part2;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		System.out.println("Escriba un numero de dias");
		Scanner sc = new Scanner(System.in);
		int numDias = sc.nextInt();
		Mes arr[] = Mes.values();
		for (int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getDias() == numDias ) {
				System.out.println(arr[i]);
			}
		}
	}

}
