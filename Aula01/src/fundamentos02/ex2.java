package fundamentos02;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		double[] notas = new double [5];
		double media = 0;
		
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <notas.length;i++) {
			System.out.println("Insira a nota dos alunos: ");
			notas[i] = sc.nextDouble();
		}
		
		for(double j : notas) {
			cont += j;
			
		} media = cont /notas.length;
		System.out.println(media);
		
		sc.close();
	}
}


