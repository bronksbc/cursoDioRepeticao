package exerciciosRepetição;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidadeNum;
		int count = 0, numero = 0;
		int quantidadePar = 0, quantidadeImpar = 0;

		System.out.println("Digite a quantidade de numeros: ");
		quantidadeNum = scan.nextInt();

		do {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			if (numero % 2 == 0) quantidadePar++;
			else quantidadeImpar ++;
				count++;
		} while (count < quantidadeNum);
		
		System.out.println("Quantidade de numeros par: " + quantidadePar);
		System.out.println("Quantidade de numeros impar: " + quantidadeImpar);
	}

}
