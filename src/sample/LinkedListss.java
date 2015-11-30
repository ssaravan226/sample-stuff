package sample;


public class LinkedListss {

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

		public static void insert_beginning() {

			Node temp = new Node(5);
			temp.next = head;
			head = temp;
			

		}

		public static void insert_end() {

			Node temp = new Node(6);

			Node iterator_node = head;
			while (iterator_node.next != null) {

				iterator_node = iterator_node.next;

			}
			iterator_node.next = temp;
			//display();

		}

		public static void insert_middle() {

			Node temp = new Node(8);

			Node iterator_node = head;
			while (iterator_node != null) {

				if(iterator_node.data==3){
					temp.next=iterator_node.next;
					iterator_node.next=temp;
					display();
					break;
				}
				iterator_node=iterator_node.next;
			}
		}
			
			public static void delete() {

				
				int count=1;
				Node iterator_node = head;
				while (iterator_node != null) {

					if(count==3){
						
						iterator_node.next=iterator_node.next.next;
						display();
						break;
					}
					iterator_node=iterator_node.next;
					++count;
				}
				

		}
		
		public static void main(String args[]) {

			Node n1 = new Node(1);
			Node n2 = new Node(2);
			Node n3 = new Node(3);

			head = n1;
			System.out.println("1" + n1.data);
			n1.next = n2;
			System.out.println("2" + n2.data);
			n2.next = n3;
			System.out.println("3" + n3.data);
			// display(head);
			insert_beginning();
			insert_end();
			insert_middle();
			delete();
		}

	}
}
