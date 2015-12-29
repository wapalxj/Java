package C12_OOPTech;

import java.util.ArrayList;
import java.util.List;

/*
 *对象组合作业
 */
public class ZWorkOfzuhe {

	public static void main(String[] args) {
		Store s1 =new Store("shudian");
		Book b1=new Book("book1", "vnix", 100, "YNU");
		Book b2=new Book("book2", "vnix", 100, "YNU");
		Book b3=new Book("book3", "vnix", 100, "YNU");
		Book b4=new Book("book4", "vnix", 100, "YNU");
		s1.books.add(b1);
		s1.books.add(b2);
		s1.books.add(b3);
		s1.books.add(b4);
		s1.getBooks();
		
        Reader r1 =new Reader("vnix");
		r1.comment(s1,b1);
		r1.comment(s1, b2);
		
		s1.getCom();

	}

}

class Book{
	String name;
	String author;
	double price;
	String publisher;
	
	
	public Book() {
		super();
	}
	public Book(String name, String author, double price, String publisher) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}


class Store{
	String name;
	List<Book> books =new ArrayList<Book>();
	Comments com =new Comments();

	public Store() {
		super();
	}

	public Store(String name) {
		super();
		this.name = name;
	    }

	public String getName() {
		return name;
	}
	public void getCom() {
		com.get();
	}
	
	class Comments{
		List<String> Contents =new ArrayList<String>();
		
		public Comments() {
		}
		
		public void add(String com) {
			Contents.add(com);
		}
		
		public void get() {
			for (int i = 0; i < Contents.size(); i++) {
				String str=(String)Contents.get(i);
				System.out.println(str);
			}
			
		}
	}

	public void getBooks() {
		for (int i = 0; i < books.size(); i++) {
			String str=(String)books.get(i).getName();
			System.out.println(str);
		}
	}
}

class Reader{
	String name;
	public Reader(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void comment(Store s,Book book) {
		s.com.add(this.getName()+" say: the book is bad:"+book.getName());
	}
}

