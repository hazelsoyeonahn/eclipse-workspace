package exercises;

/**
 * This is a desription of the Library class.
 * There is a book object in this class.
 * This class is for adding books and find if they are borrowed or not.
 * 
 * @author Hazel Soyeon Ahn
 */

public class Library {
	
	private int capacity;
	private Book[] books;
	
	//has a constructor with the method signature
	public Library(int capacity) {
		this.books = new Book[capacity];
	}
	
	//toString method to print the contents of the library
	public String toString(){
		return "Contents of the library\n"+"1. "+books[0]+"\n2. "+books[1]+"\n3. "+books[2]+"\n4. "+books[3]+"\n5. "+books[4];
	}
	
	
	//has a method to add book object into the first free location in the
	//array and returns true. Otherwise, false is returned.
	int i = 0;
	public boolean addBook(Book book) {
		if(!(i >= this.books.length)) {
			books[i] = book;
			++i;
		}
		
		if(this.books.length != 6) {
			return false;
		}
		
		return true;
	}
	
	//has a method to check if book is borrowed or not
	int x = 0;
	public Book borrow(String title) {
		boolean equal;
		
		int y = 0;
		
	for (int j = 0; j < books.length; ++j) {
		if(!(x >= this.books.length)) {
					
			equal = books[x].getTitle().equals(title);
				
			if(equal)
			{
					y = x;
			}
			++x;
		}	
	}
		
		return books[y];
	}
}
