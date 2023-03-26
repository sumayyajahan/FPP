package number5;

import java.util.ArrayList;

public class BookStore {
	/*
	 * 1- Define a class called BookStore to maintain the record of books sold. The
	 * store contains three categories of books i.e. “Kids”, “Engineering”, and
	 * “Story”. The following details should be maintained for each book. a. Book
	 * category b. Author c. Title d. Publisher e. Selling price of the book f.
	 * Quantity Create a constructor that initializes the Store ID and the rest of
	 * the details of the book mentioned above. Include a method named
	 * trackSalesStatus that will display the total number of books sold by the
	 * store (add a static variable that tracks the total number of books sold).
	 * Also, include a method to display the quantity available corresponding to
	 * each Book ID. Write a main method to test your class.
	 */
	// int, byte , short, long, float, double, char
	//wrapper class : Integer
	
	private int storeId;
	private ArrayList<Book> books = new ArrayList<>();
	public static int totalBookSold;
	
    public BookStore(int storeId) {
		this.storeId = storeId;
	}
    
    public void addBook(Book book) {
    	books.add(book);
    }
    
    public void trackSalesStatus() {
    	System.out.print("Total book sold: " + totalBookSold);
    }

    public void displayAvailableBook() {
    	for(Book book: books) {
    		System.out.print("Category: " + book.getBookCategory());
        	System.out.print("Author: " + book.getAuthor());
        	System.out.print("Title: " + book.getTitle());
        	System.out.print("Publisher: " + book.getPublisher());
        	System.out.print("Quantity: " + book.getQuantity());
        	System.out.println();
    	}
    }
    
    public void sellBook(int bookId, int quantity) {
    	for(Book book: books) {
    		if(bookId == book.getId()) {
    			book.setQuantity(book.getQuantity() - quantity);
    			totalBookSold += quantity;
    		}
    	}
    }


//	private void sold(int id) {
//		totalNumberbooksSold++;
//		for (int i = 0; i < bookList.size(); i++) {
//			if(id == bookList.get(i).id)
//			{
//				Book book = bookList.get(i);
//				book.quantity--;
//				break;
//			}
//		}	
//		
//	}
//	
//	public int trackSalesStatus(){
//		
//		return totalNumberbooksSold;
//	}
//	
//	
	

	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore(100);
		Book kids = new Book(1, "kids", "Java author", "java title", "java publisher ", 155.5, 10);
		Book engineering = new Book(2, "engineering", "Java author", "java title", "java publisher ", 55.5, 10);
		Book story = new Book(3, "story", "Java author", "java title", "java publisher ", 255.5, 10);
		bookStore.addBook(kids);
		bookStore.addBook(engineering);
		bookStore.addBook(story);
		
		//before sell
		System.out.println("Before sell:");
		bookStore.displayAvailableBook();
		
		bookStore.sellBook(1, 5);
		bookStore.sellBook(3, 3);
		
		System.out.println();
		//after sell
		System.out.println("After sell:");
		bookStore.displayAvailableBook();
		
		System.out.println();
		System.out.println("Total book sold: " + BookStore.totalBookSold);
		
		//Book book = new Book(1,"Java","cse","java author","java publisher",50.50,10);
		
//		BookStore bookStore = new BookStore(1);
//		bookStore.bookList.add(new Book(1,"Java","cse","java author","java publisher",50.50,10));
//		bookStore.bookList.add(new Book(2,"Data Structure","Data","Data Structure author","Data Structure publisher",80.50,10));
//		bookStore.bookList.add(new Book(3,"Micro","Micro","Micro author","Micro publisher",50.50,10));
//		bookStore.bookList.add(new Book(4,"C","C","C author","C publisher",50.50,10));
//		
//		bookStore.sold(1);
//		bookStore.sold(2);
//		
//		//int bookNumber = bookStore.bookList.get(0).quantity;
//	
//		System.out.println(bookStore.trackSalesStatus());
//		System.out.println("--------------------------------");
//		for(int i=0; i<bookStore.bookList.size(); i++) {
//			System.out.println(bookStore.bookList.get(i).title+ " Quantity "+bookStore.bookList.get(i).quantity);
//		}
//		System.out.println("--------------------------------");
//		System.out.println(bookStore.bookList.get(0).title+ " Quantity "+bookStore.bookList.get(0).quantity);
//		System.out.println(bookStore.bookList.get(1).title);
//		System.out.println(bookStore.bookList.get(2).title);
//		System.out.println(bookStore.bookList.get(3).title);
//		
		

	}

}
