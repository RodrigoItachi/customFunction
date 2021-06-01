package customFunction.services;

import java.util.List;
import java.util.function.Predicate;

import customFunction.entities.Product;

public class ProductService {
	public double filteredSum(List<Product> list, Predicate<Product> critiria) {
		double sum = 0.0;
		for (Product product : list) {
			if (critiria.test(product)) {//main focus
				sum += product.getPrice();
			}
		}
		return sum;
	}
}