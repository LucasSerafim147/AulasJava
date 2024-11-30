package methods;

import java.util.Scanner;

public class JavaMetodos {
	Scanner sc = new Scanner(System.in);
	int idade(){
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		return idade;
	}
	double valor() {
		System.out.println("Digite o valor: ");
		
		return 25.50;
	}
	String nome() {
		return "Lucas";
	}
	Boolean Estado(){
		return true;
	}
	

}
