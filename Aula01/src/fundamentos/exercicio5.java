package fundamentos;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira seu gênero com F-Feminino | M - Masculino: ");
		char a = in.next().charAt(0) ;
		if (a == 'm' || a == 'M') {
			System.out.println("Masculino");
		}else {
			if (a == 'f' || a =='F');
		}
		System.out.println("Feminino");
		
	}

}
