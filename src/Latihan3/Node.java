package Latihan3;

public class Node {
	int data;
	Node next;
	
	//inisialisasi atribut node
	public Node(int data) {
		this.data = data;
	}
	
	//setter & getter
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

}
