package fundamentos;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		System.out.println("Insira sua primeira notaa: ");
		double a = nota.nextDouble();
		System.out.println("Insira sua segunda nota: ");
		double b = nota.nextDouble();
		
		double media = (a+b)/2;
		
		System.out.println("Suas média: " + media);
		
	}

}
