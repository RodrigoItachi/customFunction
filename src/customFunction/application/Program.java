package customFunction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import customFunction.entities.Product;
import customFunction.services.ProductService;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Locale.setDefault(Locale.CANADA);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		
		
		ProductService productService = new ProductService();
		
		System.out.print("Enter the letter to know the sum of the products: ");
		char critiria = leia.next().toUpperCase().charAt(0);
		
		double sum = productService.filteredSum(list, p -> p.getName().charAt(0) == critiria);//main focus

		System.out.println("Sum= " + String.format("%.2f", sum));

		leia.close();

	}

}