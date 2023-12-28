package fixacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConvProgram {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		CurrencyConverter.comprarDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f" , CurrencyConverter.Converter());
		
		
		
		sc.close();
		

	}

}
