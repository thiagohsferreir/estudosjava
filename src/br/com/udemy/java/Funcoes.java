package br.com.udemy.java;

import java.util.Scanner;

public class Funcoes {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter three number: ");
		
		int higher = max(a, b, c);
		showResult(higher);
		
		sc.close();
	}
	
	//Já como é uma função "util", que retornará um valor, deverá colocar o tipo, que no caso é o int.
	public static int max(int x,int y,int z) {
		int aux;
		if (x > y && x > z ) {
			aux = x;
		} else if (y > z ) {
			aux = y;
		} else aux = z;
		
		return aux;

	}
	
	
	// Como o showResult não vai retornar nenhum valor, apenas imprimir o valor, ele receberá void.
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
