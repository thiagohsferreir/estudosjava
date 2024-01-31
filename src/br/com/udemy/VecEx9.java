package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx9 {
	
//	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
//	devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
//	da pessoa mais velha

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar?");
		int n = sc.nextInt();
		Entities[] vectNome = new Entities[n];
		Entities[] vectIdade = new Entities[n];
		String name = "";
		String maiorNome = "";
		int age = 0;
		int agePassado = 0;
		for(int i = 0; i < vectNome.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1)+ "a pessoa:");
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			if(age > agePassado) {
				agePassado = age;
				maiorNome = name;
			} 
			vectNome[i] = new Entities(name);
			vectIdade[i] = new Entities(age);
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maiorNome);

	}

}
