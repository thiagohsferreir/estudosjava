package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx5 {
	
//	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
//	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
//	considerando a primeira posição como 0 (zero). 


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		double valor = 0;
		int posicao = 0;
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero:");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > valor) {
				valor = vect[i];
				posicao = i;
			}
			
		}
		
		System.out.println("MAIOR VALOR: " + valor);
		System.out.println("POSICAO DO MAIOR VALOR: " + posicao);
		
		
	}

}
