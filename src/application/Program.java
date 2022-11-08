package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import util.MyComparator;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Usando a clase MyComparator
		//list.sort(new MyComparator()); 
		
		//Sintaxa de classe anonima.
		/*Comparator<Product> comparator = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};*/
		
		//Usando expressao lambda funcao-anonima-arrow function
		Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comparator);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
