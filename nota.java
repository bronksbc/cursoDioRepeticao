package exerciciosRepeti��o;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nota;

		System.out.println("Digite sua nota: ");
		nota = scan.nextInt();

		while ((nota > 10) || (nota < 0)) {	
			System.out.println("Valor inv�lido!");
			System.out.println("Digite novamente:");
			nota = scan.nextInt();
		}
		System.out.println("Sua nota e " + nota);
	}

}
