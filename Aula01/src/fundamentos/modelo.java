package fundamentos;

import java.util.Scanner;

public class modelo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		System.out.println("Telefonou para a vítima? ");
		char resposta = entrada.next().charAt(0);
		if(resposta == 's' || resposta == 'S')
			cont += 1;
		System.out.println("Esteve no local do crime? ");
		resposta = entrada.next().charAt(0);
		if(resposta == 's' || resposta == 'S')
			cont += 1;
		System.out.println("Mora perto da vítima? ");
		resposta = entrada.next().charAt(0);
		if(resposta == 's' || resposta == 'S')
			cont += 1;
		System.out.println("Você devia para a vítima? ");
		resposta = entrada.next().charAt(0);
		if(resposta == 's' || resposta == 'S')
			cont += 1;
		System.out.println("Já trabalhou com a vítima? ");
		resposta = entrada.next().charAt(0);
		if(resposta == 's' || resposta == 'S')
			cont += 1;
		if (cont == 0) {
			System.out.println("Você é inocente ");
		}else if (cont == 2)
			System.out.println("Vocé é suspeito(a)");
		
		else if (cont == 3 || cont == 4) {
		System.out.println("Você é cúmplice");
		
		}else if (cont == 5) {
		System.out.println("Você é o assasino");
		
		}else 
			System.out.println("Insira um valor invalido: ");
		
		}
	}


