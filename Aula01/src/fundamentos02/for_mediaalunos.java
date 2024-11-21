package fundamentos02;

import java.util.Scanner;

public class for_mediaalunos {
	public static void main(String[] args) {
		int alunos;
		double notas, nota = 0, media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos: ");
		alunos = entrada.nextInt();

		for (int i = 0; i < alunos; i++) {
			System.out.println("Insira a notas do alunos: ");
			nota = nota + entrada.nextDouble();

		}
		media = nota / alunos;
		System.out.println(media);

	}
}
