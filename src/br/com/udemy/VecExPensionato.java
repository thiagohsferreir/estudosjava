package br.com.udemy;

import java.util.Locale;
import java.util.Scanner;

public class VecExPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
	Hospedes[] hospedes = new Hospedes[10];
	System.out.println("Quantos quartos irá alugar?");
	
	int hospede = sc.nextInt();
	String name, email;
	int room;
	
	for(int i = 0; i < hospede; i++) {
		sc.nextLine();
		System.out.println("Rent #" + (i+1));
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Room: ");
		room = sc.nextInt();
		
		hospedes[room] = new Hospedes(name, email, room);
	}
	
	System.out.println("Quartos Ocupados:");
	for(int i = 0; i < 10; i++) {
		if(hospedes[i] != null) {
			System.out.println(i + ": " + hospedes[i].nome + ", " + hospedes[i].email);
		}
		
	}
	sc.close();
	}

}
