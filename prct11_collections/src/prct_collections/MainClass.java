package prct_collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list: " + list);
		
		list.add(2, "Programming");
		list.set(0, "Hi"); // be used to change element
		System.out.println("list: " + list);
		System.out.println("list size: " + list.size());
		
		// size, get(index), remove(index), clear, isempty ... (same c++)
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		map.put(3, "Java");
		map.put(5, "World");
		
		System.out.println("map: " + map);
		// size, get(key), remove(key), clear, isempty ... (same c++)
		
		boolean b = map.containsKey(3);
		System.out.println("map.containsKey(3) : " + b);
		
		b = map.containsValue("World");
		System.out.println("map.containsValue(\"World\") : " + b);
	}
}
