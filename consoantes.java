package exerciciosRepeti��o;

import java.util.Scanner;

public class consoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		int count = 0;
		do {
			count++;
			System.out.println("Digite um letra: ");
			String letra = scan.next();
			switch (letra) {
			case "a":
				break;

			case "e":
				break;

			case "i":
				break;

			case "o":
				break;

			case "u":
				break;

			default:
				quantidadeConsoantes++;
				break;
			}
		} while (count < consoantes.length);
		for (String consoante : consoantes) {
			if (consoante != null ) 
			System.out.print("consoantes: " + consoante);
		}
		System.out.println("\nconsoantes= " + quantidadeConsoantes);

	}
}
