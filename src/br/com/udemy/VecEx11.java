package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx11 {

	// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N
	// pessoas. Fazer um programa
	// que calcule e escreva a maior e a menor altura do grupo, a média de
	// altura das mulheres, e o número
	// de homens.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double altura;
		char genero;
		double alturaM = 0.0;
		int homem = 0;
		double alturaMenor = 0;
		double alturaMaior = 0.0;
		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();

		Entities[] vect = new Entities[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Altura da " + (i + 1) + "a pessoa:");
			altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa:");
			genero = sc.next().charAt(0);

			vect[i] = new Entities(genero, altura);

			if (vect[i].height > alturaMaior) {

				alturaMaior = vect[i].height;

			}
			if (alturaMenor == 0) {

				alturaMenor = altura;

			} else if (vect[i].height < alturaMenor) {

				alturaMenor = vect[i].height;

			}

			if (vect[i].sex == 'F') {
				alturaM += vect[i].height;
			} else {
				homem++;
			}

		}

		System.out.println("Menor altura = " + alturaMenor);
		System.out.println("Maior altura = " + alturaMaior);
		System.out.printf("Media das alturas das mulheres = %.2f\n",
				alturaM / (n - homem));
		System.out.println("Numero de homens = " + homem);

	}

}
