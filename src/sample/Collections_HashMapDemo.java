package sample;

import java.util.*;

public class Collections_HashMapDemo {

	static class Student {
		int id;
		String name;
		String address;

		Student(int id, String name, String address) {
			this.id = id;
			this.name = name;
			this.address = address;
		}
	}

	public static void main(String args[]) {

		Student st = new Student(1, "AA", "ABA");
		Student st1 = new Student(2, "BB", "BAB");
		Student st2 = new Student(2, "BB", "BAB");
		Student st3 = new Student(3, "CC", "BAB");
		Student st4 = new Student(4, "DD", "BAB");
		Student st5 = new Student(5, "EE", "BAB");
		Student st6 = new Student(6, "FF", "BAB");
		// Create a hash map
		HashMap<Integer, Student> hm = new HashMap();

		// Put elements to the map
		hm.put(11, st);
		hm.put(12, st1);
		hm.put(100, st2);
		hm.put(122, st3);
		hm.put(127, st4);
		hm.put(167, st5);
		hm.put(45, st6);
		// List <Integer> list1=(List<Integer>) hm.keySet();

		List<Integer> list1 = new ArrayList<Integer>();

		Set<Integer> set = hm.keySet();
		for (int i : set) {

			list1.add(i);
			//
			// System.out.println(hm.get(i).address);
			//
			// System.out.println(hm.get(i).id);
			// System.out.println(hm.get(i).name);

			// if((hm.get(i).address).equals("ABA")){
			// System.out.println("key is "+i);
		}
		Collections.sort(list1);
		System.out.println(list1);
		for(int j:list1){
			System.out.println("hdeiuhfuiwehfiwej"+hm.get(j).name);
		}
	}

}
