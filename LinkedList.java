package lab;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		size++;
	}

	public void add(int data, int index) {
		if (index > size) {
			System.out.println("Index out of bonds");

		} else {
			Node node = new Node(data);
			if (index == 0) {
				node.setNext(head);
				head = node;
			}
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
			size++;
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public void remove(int index) {
		if (index > size) {
			System.out.println("error");
		} else {
			if (index == 0) {
				head = head.getNext();
			} else {
				Node temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.getNext();
				}	
				temp.setNext(temp.getNext().getNext());
				size--;
			}
		}
	}
}
