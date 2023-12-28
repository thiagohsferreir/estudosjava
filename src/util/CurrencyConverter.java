package util;

public class CurrencyConverter {

	public static double dollar;
	public static double comprarDollar;
	
	
	public static double Converter() {
		
		double reais = dollar*comprarDollar;
		
		
		return reais + (reais*6/100) ;
		
		
	}
	

}
