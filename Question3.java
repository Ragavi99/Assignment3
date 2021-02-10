package Assignment3;

import java.util.Scanner;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}


class EngineeeringBook extends Book
{
	private String category;
	
	Scanner sc = new Scanner(System.in);
	
	public EngineeeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		Book b = new Book(67, "java", "safan", 189);
		b.getBookNo();
		b.getTitle();
		b.getAuthor();
		b.getPrice();
		System.out.println(b.getBookNo());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		
		 EngineeeringBook eb = new  EngineeeringBook(67, "java", "safan", 189, "javaprogramming");
		 eb.getCategory();
		 System.out.println(eb.getCategory());
		

	}

}
