 package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx1 {

//	Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
//	e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos números você irá digitar?");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();	
		}
		System.out.println("Números negativos:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
