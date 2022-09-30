package z_homework_8_3;

public class Book {
	private int number; 
	private String title; 
	private String author; 
	private static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title; 
		this.author = author; 
		this.number = countOfBooks;
		countOfBooks++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public boolean equals(Object) {
		if(this.title.equals(this.author))
			return true; 
		else 
			return false; 
	}
	
	
}
