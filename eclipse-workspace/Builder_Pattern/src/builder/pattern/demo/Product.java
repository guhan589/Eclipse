package builder.pattern.demo;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> list;
	public Product() {
		list = new LinkedList<String>();
	}
	public void Add(String str) {
		list.add(str);
	}
	public void Show() {
		System.out.println("\n Product completed as below:");
		for(int i = 0; i < list.size() ;i++) {
			System.out.println(list.get(i));
		}
	}
}
