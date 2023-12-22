package fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Classe;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Classe classe = new Classe();
		
		System.out.print("PLEASE INSERT A NAME: ");
		classe.name = sc.nextLine();
		System.out.println("PLEASE INSERT A NOTE OF 1TH FOURTH QUARTER");
		classe.note1 = sc.nextDouble();
		System.out.println("PLEASE INSERT A NOTE OF 2TH FOURTH QUARTER");
		classe.note2 = sc.nextDouble();
		System.out.println("PLEASE INSERT A NOTE OF LAST FOURTH QUARTER");
		classe.note3 = sc.nextDouble();
		
		classe.determinar();
	}
	
}
