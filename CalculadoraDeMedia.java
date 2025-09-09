package fag;

import java.util.Scanner;

public class CalculadoraDeMedia {

	public static void main(String[] args) {
		double media;
		String status;
		String nome;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {

			System.out.printf("nome do aluno %d:", i);
			nome = scanner.nextLine();

			System.out.printf("nota 1 do aluno:");
			double notaum = scanner.nextDouble();

			System.out.printf("nota 2 do aluno:");
			double notadois = scanner.nextDouble();

			System.out.printf("nota 3 do aluno:");
			double notatres = scanner.nextDouble();

			scanner.nextLine();

			media = calcularMedia(notaum, notadois, notatres);
			status = verificarAprovacao(media);
			exibirResultado(nome, media, status);
			System.out.println();
		}

		scanner.close();

	}

	// metodo para calcular media.
	public static double calcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;

	}

	// metodo de verificação
	public static String verificarAprovacao(double media) {
		if (media >= 7) {
			return "aprovado";
		} else {
			return "reprovado";
		}

	}
	// metodo de mostrar os resutados
	public static void exibirResultado(String nome, double media, String situação) {
		System.out.println("nome do aluno:" + nome);
		System.out.println("media do aluno:" + media);
		System.out.println("situação do aluno:" + situação);
	}

}
