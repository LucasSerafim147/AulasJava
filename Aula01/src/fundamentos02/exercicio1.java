package fundamentos02;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] arrayUm = new int[4];
		int[] arrayDois = new int[4];
		int[] arrayTres = new int[4];
		int[] arrayQua = new int[4];

		for (int i = 0; i < arrayUm.length; i++) {
			System.out.println("Digite o numero para o array um ");
			arrayUm[i] = entrada.nextInt();
		}
		for (int j = 0; j < arrayDois.length; j++) {
			System.out.println("Digite o numero para o array dois ");
			arrayDois[j] = entrada.nextInt();
		}


		
		for (int m : arrayUm) {
			System.out.println(m+" ");
		}

		for (int d : arrayDois) {
			System.out.println(d+" ");
		}


	}

}
