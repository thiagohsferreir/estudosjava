package entities;

public class Raius {

	
	public double raius;
	

	public static double Circunferencia(double raius) {
		
		return 2*Math.PI*raius;
	}
	
	public static double Volume(double raius) {
		
		return (4*Math.PI*Math.pow(raius, 3)) / 3;
	}
	
	
}


