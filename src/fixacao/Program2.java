package fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NAME: ");
		employee.name = sc.nextLine();
		System.out.print("GROSS SALARY: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ employee);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		employee.IncreaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Updated data: " + employee);
	}
	
}
