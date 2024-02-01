package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecEx10 {

	
//	Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
//	no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
//	os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
//	igual a 6.0 (seis).
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos alunos serão digitados?");
		n = sc.nextInt();
		String nome;
		double nota1;
		double nota2;
		Entities vect[] = new Entities[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			sc.nextLine();
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			nome = sc.nextLine();
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			
			vect[i] = new Entities(nome, nota1, nota2);
			
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		
		for(int i = 0; i < vect.length; i++) {
			
			if((vect[i].grade1 + vect[i].grade2) / 2 >= 6.0) {
				
				System.out.println(vect[i].name);
				
			}
			
		}
		sc.close();
		
	}
	
}
