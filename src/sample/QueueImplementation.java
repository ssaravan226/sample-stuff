package sample;


public class QueueImplementation {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}

		public static void display() {

			Node iterator_node = head;
			System.out.println("The linked list is : ");
			while (iterator_node != null) {
				System.out.println(iterator_node.data);
				iterator_node = iterator_node.next;
			}
		}
		
		public static void enqueu(){
			Node iterator_node=new Node(10);
			iterator_node.next=head;
			head=iterator_node;
			display();
		}
		public static void dequeu(){
			Node iterator_node=head;
			Node temp=new Node(11);
			while(iterator_node.next.next!=null){
				iterator_node=iterator_node.next;
			}
			iterator_node.next=null;
			display();
		}
		
		public static void main(String args[]){
			
			Node n1=new Node(1);
			Node n2=new Node(2);
			Node n3=new Node(3);
			Node n4=new Node(4);
			head =n1;
			head.next=n2;
			n2.next=n3;
			n3.next=n4;
			enqueu();
			dequeu();
		}
}
	
}

