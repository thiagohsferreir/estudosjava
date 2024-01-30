package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx4 {

//	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
//	tela todos os números pares, e também a quantidade de números pares. 

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.println("Quantos numeros você vai digitar? ");
		
		n = sc.nextInt();
		
		int vect[] = new int[n];
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
				
			}
		
		System.out.println("NUMEROS PARES: ");
		
		int sum = 0;
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				sum++;
			}
		}
		
		System.out.println("\nQUANTIDADES DE NUMEROS PARES: " + sum);
	}

}
