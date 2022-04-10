package Practise;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		h.put("A", "test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		h.put(1, 10);
		h.put(2, 300);
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		System.out.println(h.get(3));
		
	
	}

}
