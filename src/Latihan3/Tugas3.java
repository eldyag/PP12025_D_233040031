package Latihan3;

public class Tugas3 {
	class Node {
	    double data;
	    Node next;

	    public Node(double data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class StrukturList {
	    private Node head;

	    public StrukturList() {
	        this.head = null;
	    }

	    // Tambah elemen di akhir list
	    public void addTail(double data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Tambah elemen di awal list
	    public void addHead(double data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Tambah elemen di posisi tertentu (1-based index)
	    public void addMid(double data, int position) {
	        if (position <= 0) {
	            System.out.println("Posisi harus lebih dari 0");
	            return;
	        }

	        Node newNode = new Node(data);
	        if (position == 1) {
	            addHead(data);
	            return;
	        }

	        Node temp = head;
	        int count = 1;
	        while (temp != null && count < position - 1) {
	            temp = temp.next;
	            count++;
	        }

	        if (temp == null) {
	            System.out.println("Posisi melebihi ukuran list, elemen ditambahkan di akhir.");
	            addTail(data);
	        } else {
	            newNode.next = temp.next;
	            temp.next = newNode;
	        }
	    }

	    // Menampilkan elemen dalam list
	    public void displayElement() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	}

	// Kode utama (main method)
	public class Main {
	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();
	        StrukturList list2 = new StrukturList();

	        list.addTail(4.5);
	        list.addMid(3.4, 1);
	        list.addHead(2.1);
	        System.out.println("Elemen list 1:");
	        list.displayElement();

	        list2.addTail(5.5);
	        list2.addMid(4.5, 1);
	        list2.addMid(1.1, 1);
	        list2.addMid(2.1, 1);
	        list2.addHead(3.4);
	        System.out.println("Elemen list 2:");
	        list2.displayElement();
	    }
	}


}
