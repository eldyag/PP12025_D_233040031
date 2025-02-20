package Latihan2;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List a: 3 2 1
		StrukturList listAHead= new StrukturList();
		listAHead.addHead(1);
		listAHead.addHead(2);
		listAHead.addHead(3);
		
		System.out.print("Elemen A: ");
		listAHead.displayElement();
		
		//List b: 1 4 5 7
		StrukturList listBHead= new StrukturList();
		listBHead.addHead(7);
		listBHead.addHead(5);
		listBHead.addHead(4);
		listBHead.addHead(1);
		
		System.out.println("");
		System.out.print("Elemen B: ");
		listBHead.displayElement();
	}
}
