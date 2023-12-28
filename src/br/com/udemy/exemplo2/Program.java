package br.com.udemy.exemplo2;

import java.util.Scanner;
import entities.Product;

public class Program {

	
	public static void main(String[] args) {
		Product product;
		
		System.out.println("Enter product data: ");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		product = new Product(name, price);
		
		
		
		System.out.println("Product Data " + product);
		
		System.out.println("Enter a number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("Updated Data: " + product);
		System.out.println("Enter a number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println("Updated Data: " + product);
		
		
		
		sc.close();
	}
	
	
	
}
