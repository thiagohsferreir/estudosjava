package br.com.udemy.ppo;

import java.util.Scanner;

import fixacao.Enc;

public class Encapsulamento {

	public static void main(String[ ] args) {
		
		Enc e = new Enc();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o nome do produto?");
		
		e.setName(sc.nextLine());
		System.out.println("Price:");
		e.setPrice(sc.nextDouble());
		
		System.out.println(e.getName());
		System.out.println(e.getPrice());
		
		
		sc.close();
	}
	
}
