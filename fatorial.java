package exerciciosRepeti��o;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int fator = scan.nextInt();
		int multiplica = 1;
		
		for(int i = fator; i >=1; i--) {
			multiplica = multiplica * i;
				}
	System.out.println("!" + fator + "=" +  multiplica);
	}

}
