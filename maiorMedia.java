package exerciciosRepeti��o;
import java.util.Scanner;
public class maiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int numero;
		int count = 0;
		int soma = 0;
		int maior = 0;		
		do {
			System.out.println("numero: ");
			numero = scan.nextInt();
			soma = numero + soma;
			if(numero > maior) maior = numero;
			count = count +1;
		} while (count < 5);
		System.out.println("O n�mero maior �: "+ maior);
		System.out.println("A m�dia �: " + (soma/5));
	}

}
