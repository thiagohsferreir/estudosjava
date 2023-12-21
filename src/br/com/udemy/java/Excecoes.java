package br.com.udemy.java;



import java.util.InputMismatchException;
import java.util.Scanner;
public class Excecoes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dividendo = 0;
		int divisor = 0;
		
		try {
			System.out.println("Digite o dividendo: ");
			dividendo = sc.nextInt();
		}catch(InputMismatchException ime){
			System.err.println("Opa");
		}catch(ArithmeticException ae){
			System.err.println(ae.getMessage());
		}catch(Exception ae) {
			System.err.println(ae.getMessage());
		}
		
		
		
		
		sc.close();
	}
	
}
