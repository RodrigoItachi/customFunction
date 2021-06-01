package customFunction.services;

import java.util.List;

import customFunction.entities.Product;

public class ProductService {
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product product : list) {
			if (product.getName().charAt(0) == 'T') {
				sum += product.getPrice();
			}
		}
		return sum;
	}
}