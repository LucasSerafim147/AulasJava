package Aula01;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite o primerio número: ");
		double a = numero.nextDouble();
		System.out.println("Digite o segundo número: ");
		double b = numero.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double c = numero.nextDouble();
		
		if(a>b && a>c) {
		System.out.println("A é maior");
		}
		else if (b>a && b>c) {
			System.out.println("B é maior");
		}
		else
		{System.out.println("C é maior");}
			

	}

}
