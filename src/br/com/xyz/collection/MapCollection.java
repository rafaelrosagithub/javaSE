package br.com.xyz.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args) {
		System.out.println("Map Collection");

		Map<String, String> countries = new HashMap<>();
		countries.put("BR", "Brazil");
		countries.put("AR", "Argentina");
		countries.put("IN", "India");
		countries.put("UK", "United Kingdom");
		System.out.println(countries);

		System.out.println(countries.containsKey("IN"));
		System.out.println(countries.containsKey("CA"));
		System.out.println(countries.containsValue("Brazil"));
		System.out.println(countries.get("UK"));
		countries.remove("BR");
		System.out.println(countries);

		Set<String> keys = countries.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key + ": " + countries.get(key));
		}
	}

}
