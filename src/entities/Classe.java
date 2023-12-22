package entities;

public class Classe {

	public String name;
	public double note1;
	public double note2;
	public double note3;


	
	public void determinar() {
		
		double note = note1+note2+note3;
		System.out.println("FINAL GRADE = " + note);
		
		if(note >= 60) {
			System.out.println("PASS.");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - note) + " POINTS");
		}
		
		
	}
	
	
}
