package fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Raius;

public class Calculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter a radius: ");
		
		double raius = sc.nextDouble();
		String raio = String.format("%.2f", Raius.Circunferencia(raius));
		String volume = String.format("%.2f", Raius.Volume(raius));
		String PI = String.format("%.2f", Math.PI);
		
		System.out.println("Circunferencia: " + raio);
		System.out.println("Volume: " + volume);
		System.out.println("PI: " + PI);
		
		
		
		
		
		
		sc.close();
		
	}
}
