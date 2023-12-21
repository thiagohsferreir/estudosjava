package br.com.udemy.exemplo2;

import java.util.Scanner;
import entities.Product;

public class Program {

	
	public static void main(String[] args) {
		Product product;
		
		System.out.println("Enter product data: ");
		product = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
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
