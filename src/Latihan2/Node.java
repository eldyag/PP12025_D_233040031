package Latihan2;

public class Node {

	private int data;
	private Node next;
	
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
