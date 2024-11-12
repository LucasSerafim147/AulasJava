package Aula01;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double num = numero.nextDouble();
		
		if (num > 0) {
			System.out.println("Numero Positivo");
		}
		else {
			System.out.println("Numero Negativo");
		}

	}

}
