package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx2 {

//	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
//		- Imprimir todos os elementos do vetor 
//		- Mostrar na tela a soma e a média dos elementos do vetor 

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos números você vai digitar?");
		
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for( int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		System.out.print("Valores: ");
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print(vect[i] + " \n");
			
			sum+= vect[i];
		}
		
		System.out.printf("Soma: %.2f ", sum);
		System.out.printf("Media = %.2f ", sum/n);
		sc.close();
		
	}

}
