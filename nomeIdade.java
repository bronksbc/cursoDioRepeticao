package exerciciosRepeti��o;

import java.util.Scanner;

public class nomeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Cadastro de Aluno");

		while (true) {

			System.out.println("Digite o nome: ");
			nome = scan.next();
			if (nome.equals("0")) {
				System.out.println("Cadastro finalizado");
				break;
			}

			System.out.println("Digite a idade: ");
			idade = scan.nextInt();

		}

		System.out.println("Obrigado!");
	}
}
