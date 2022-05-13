package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		System.out.println("inicio do programa");
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Tablet2", 50.00));
		list.add(new Product("Tablet3", 40.00));
		double factor = 1.1;
		list.forEach(p -> {p.setPrice(p.getPrice() * factor);});

		list.forEach(System.out::println);

	}
}
