package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import model.services.ProductService;
import util.UpperCaseName;

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
		
		//convert a lista para stream e depois retorna (new...) uma lista somente com os nomes
		//map pega cada um item da lista e aplica o q esta dentro dele
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		System.out.println();
		
		names.forEach(System.out::println);
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("sum = " + String.format("%.2f", sum));

	}
}
