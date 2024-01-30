package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx7 {

	public static void main(String[] args) {
		
//		//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
//		mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
//		os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quantos elementos vai ter o vetor?");
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double media = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		media = media / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
			
	}

}
