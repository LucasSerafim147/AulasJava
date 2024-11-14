package fundamentos;

import java.util.Scanner;

public class exercico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vítima?(1-SIM ||0-NÃO): ");
		int a = entrada.nextInt();
		System.out.println("Esteve no local do crime?(1-SIM ||0-NÃO): ");
		int b = entrada.nextInt();
		System.out.println("Mora perto da vítima?(1-SIM ||0-NÃO): ");
		int c = entrada.nextInt();
		System.out.println("Você devia para a vítima?(1-SIM ||0-NÃO): ");
		int d = entrada.nextInt();
		System.out.println("Já trabalhou com a vítima?(1-SIM ||0-NÃO): ");
		int e = entrada.nextInt();
		int quantidade = a + b + c + d + e;

		if (quantidade == 0) {
			System.out.println("Você é inocente ");
		}else if (quantidade == 2)
			System.out.println("Vocé é suspeito(a)");
		
		else if (quantidade == 3 || quantidade == 4) {
		System.out.println("Você é cúmplice");
		
		}else if (quantidade == 5) {
		System.out.println("Você é o assasino");
		
		}else 
			System.out.println("Insira um valor invalido: ");
		
		}

	}


