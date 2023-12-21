package br.com.udemy.ppo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class ProjetoPOO {

public static void main(String[] args) {
	
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//	double a = 3.00;
//	double b = 4.00;
//	double c = 5.00;
//	double x = 7.50;
//	double y = 4.50;
//	double z = 4.02;
	
	Triangule x,y;
	
	x = new Triangule();
	y = new Triangule();
	
	System.out.println("Please, enter the measure of triangle X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	System.out.println("Please, enter the measure of triangle X: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	
	double X = x.area();
	double Y = y.area();
	
	System.out.printf("Triangle X area: %.4f\n", X);
	System.out.printf("Triangle Y area: %.4f\n", Y);
	if (X > Y) {
		System.out.println("Larger Area: X");
	} else {
		System.out.println("Larger Area: Y");
	}
	
	sc.close();
}
	
	
}
