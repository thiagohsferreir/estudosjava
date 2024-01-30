package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx8 {

//	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
//	aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
//	digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		int[ ] vect = new int[n];
		double paresSum = 0;
		int pares = 0;
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				
				paresSum += vect[i];
				pares++;
			}
			
		}
		
		if(paresSum == 0) {
			System.out.println("NENHUM NUMERO PAR");
			
		} else {
			paresSum = paresSum / pares;
			System.out.printf("MEDIA DOS PARES %.2f", paresSum);
		}
		
	}
}
