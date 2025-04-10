package Latihan3;

public class StrukturListTest {
		public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        list.addTail(3);  // Tambah elemen 3 di akhir
	        list.addTail(4);  // Tambah elemen 4 di akhir
	        list.addMid(7, 2);  // Tambah elemen 7 di index 2
	        list.addMid(8, 2);  // Tambah elemen 8 di index 2
	        list.addHead(5);  // Tambah elemen 5 di awal

	        list.displayElement();  // Output harus: 5 3 8 7 4
	        
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
