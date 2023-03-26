package number5;

public class Book {
	
	int id;
	String title;
	String bookCategory;
	String author;
	String publisher;
	double price;
	int quantity;
	
	Book(){
		
	}
	
	
	Book(int id,String title, String bookCategory, String author,  String publisher,double price, int quantity){
		this.id=id;
		this.title=title;
		this.bookCategory=bookCategory;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.quantity=quantity;
	}
	
	
public int displayAvailableBook(){
		
		return quantity;
	}

}
