package fundamentos02;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		int alunos;
		float media;
		float notas = 0;
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos na sala de aula: ");
		alunos = entrada.nextInt();

		while (cont < alunos) {

			System.out.println("Insira a nota dos aluno: ");
			notas = notas + entrada.nextFloat();
			cont += 1;
		}

		media = notas / alunos;
		System.out.println("a média dos alunos é: "+media);
		entrada.close();

	}
}
