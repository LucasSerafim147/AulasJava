package fundamentos02;

import java.util.Scanner;

public class while2 {
	public static void main(String[] args) {
		int x = 1, num;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Insira os numeros para a operação: ");
		num = entrada.nextInt();
		while (x < num) {
			if (x % 2 != 0) {
				System.out.println(x);

			}

			x++;

		}
	}

}
