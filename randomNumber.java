package exerciciosRepeti��o;

import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int [] numberRandom = new int [20];
		for(int i=0 ; i < numberRandom.length;  i++ ) {
			/* int number = rand.nextInt(bound : 100);
			numberRandom[i] = number; */
		}
		System.out.println("N�meros Aleatorios"); 
		for (int n : numberRandom) {
			System.out.println(n);
		}
		System.out.println("Sucessor"); 
		for (int n : numberRandom) {
			System.out.println(n + 1);
		}	
	}

}
