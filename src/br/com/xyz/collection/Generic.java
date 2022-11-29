package br.com.xyz.collection;

import java.util.ArrayList;

public class Generic<E> {

	E element;

	public void setElement(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}

	public double add(ArrayList<? extends Number> list) {
		double total = 0;
		for (Number number : list) {
			total += number.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("Generic");

		Generic<String> g = new Generic<>();
		g.setElement("Test Generic Object");
		System.out.println(g.getElement());
//		g.setElement(11111);
//		String e = (String) g.getElement();
//		System.out.println(e.toUpperCase());

		System.out.println(g.getElement().toUpperCase());
	}
}
