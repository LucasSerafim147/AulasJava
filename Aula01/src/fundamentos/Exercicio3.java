package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	Scanner Dia = new Scanner(System.in);
	System.out.println("Insira o  número do dia da semana: ");
	int semana = Dia.nextInt();
	
	if(semana == 1)
		System.out.println("É domingo! ");
	else if(semana == 2)
		System.out.println("É Segunda! ");
	else if(semana == 3)
		System.out.println("É terça! ");
	else if(semana == 4)
		System.out.println("É Quarta! ");
	else if(semana == 5)
		System.out.println("É quinta! ");
	else if(semana == 6)
		System.out.println("É sexta! ");
	else if(semana == 7)
		System.out.println("É Sábado! ");
	}

}
