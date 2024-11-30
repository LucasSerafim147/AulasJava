package JavaPOO;

import java.util.Scanner;

public class Pessoa {
	String nome;
	Double peso;
	int idade;
	
	public void comer() {
		System.out.println(this.nome+ " foi comer");
	}
	
	public void cadastrar() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Cadastre seu nome: ");
		this.nome = scr.nextLine();
		System.out.println("Insira sua idade: ");
		this.idade = scr.nextInt();
		System.out.println("Insira seu peso: ");
		this.peso = scr.nextDouble();
		scr.close();
		
		
		
	}
}

