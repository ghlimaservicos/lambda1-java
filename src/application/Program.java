package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		System.out.println("inicio do programa");
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Tablet2", 50.00));
		list.add(new Product("Tablet3", 40.00));
		
		double min = 100;

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.removeIf(p -> p.getPrice() >= min);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
