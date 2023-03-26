package number5;

import java.util.ArrayList;

public class BookStore {
	
	private int id;
	static private int totalNumberbooksSold;
	int bookId;
	
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	BookStore(int id){
		this.id=id;
		
	}
	private void sold() {
		totalNumberbooksSold++;
	}
	
	public int trackSalesStatus(){
		
		return totalNumberbooksSold;
	}
	
	
	

	public static void main(String[] args) {
		//Book book = new Book(1,"Java","cse","java author","java publisher",50.50,10);
		
		BookStore bookStore = new BookStore(1);
		bookStore.bookList.add(new Book(1,"Java","cse","java author","java publisher",50.50,10));
		bookStore.bookList.add(new Book(2,"Data Structure","Data","Data Structure author","Data Structure publisher",80.50,10));
		bookStore.bookList.add(new Book(3,"Micro","Micro","Micro author","Micro publisher",50.50,10));
		bookStore.bookList.add(new Book(4,"C","C","C author","C publisher",50.50,10));
		
		bookStore.sold();
		bookStore.sold();
		System.out.println(bookStore.trackSalesStatus());
		
		System.out.println(bookStore.bookList.get(0).title);
		System.out.println(bookStore.bookList.get(1).title);
		System.out.println(bookStore.bookList.get(2).title);
		System.out.println(bookStore.bookList.get(3).title);
		
		

	}

}
