package customFunction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import customFunction.entities.Product;
import customFunction.services.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		ProductService productService = new ProductService();
		double sum = productService.filteredSum(list, p -> p.getName().charAt(0) == 'T');//main focus

		System.out.println("Sum= " + String.format("%.2f", sum));

	}

}