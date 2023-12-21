package entities;

public class Class {

	public String name;
	public double note1;
	public double note2;
	public double note3;


	public double calcular() {
		return note1 + note2 + note3;
	}
	
	public void determinar() {
		
		System.out.println("FINAL GRADE = " + calcular());
		
		if(note1 + note2 + note3 == 60) {
			
		}
		
		
	}
	
}
