package lab;

public class Main {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.add(5);
		myList.add(6);
		myList.printList();

		myList.add(7, 1);
		myList.printList();

		myList.remove(2);
		myList.printList();

	}

}
