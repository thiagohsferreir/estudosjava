package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx3 {

//	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
//	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
//	bem como os nomes dessas pessoas caso houver. 

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();
		
		Entities vect[] = new Entities[n];
		String name;
		int age ;
		double height ;
		double sumH = 0;
		int sumA = 0;
		for(int i = 0; i < vect.length; i++) {
			
			System.out.println("Dados da " + (i+1) +"a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("\nIdade: ");
			age = sc.nextInt();
			System.out.print("\nAltura: ");
			height = sc.nextDouble();
			vect[i] = new Entities(name, age, height);
			
			sumH += vect[i].height;
			
			if(vect[i].age < 16) {
				
				sumA++;
				
			}
		}
		sumH = sumH/n;
		double porcentagem = sumA*100/n;
		System.out.printf("Altura média: %.2f\n", sumH );
		System.out.print("Pessoas com menos de 16 anos: " + porcentagem + "%\n" );
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].age < 16) {
				System.out.println(vect[i].name);
			}
		}
		
		sc.close();
	}

}
