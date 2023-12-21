package br.com.udemy.java;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//			String x = sc.next();
//			
//			System.out.println(x);
//			
//			sc.close();

		Scanner sc = new Scanner(System.in);

		String nome, nomeDoMeio, sobrenome;

		int x = sc.nextInt();
		sc.nextLine(); // se atribui esse nextLine vazio pq quando se tem uma entrada de dado diferente de nextLine, anterior ao mesmo, quando aperta o Enter o primeiro nextLine toma espaço vazio
		nome = sc.nextLine();
		nomeDoMeio = sc.nextLine();
		sobrenome = sc.nextLine();

		System.out.println("Seu primeiro nome é: " + nome);
		System.out.println("Seu nome do meio é: " + nomeDoMeio);
		System.out.println("Seu sobrenome é: " + sobrenome);

	}

}
