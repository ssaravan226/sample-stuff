package sample;

import java.util.LinkedList;

public class Collections_LinkedListDemo {

	public static void main(String args[]){
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(4);
		ll.add(6);
		ll.add(8);
		ll.add(10);
		ll.add(3,81);
		int temp=ll.indexOf(8);
		
		ll.remove(temp);
		ll.add(9);
		ll.add(10);
		ll.add(11);
		ll.remove(ll.indexOf(10));
		System.out.println(ll);
		
	}
}
