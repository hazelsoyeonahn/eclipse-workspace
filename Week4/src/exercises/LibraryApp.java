package exercises;

/**
 * This is a desription of the LibraryApp class.
 * There is library and book objects in this class.
 * This class is a main libraryApp.
 * You can access to add books and check if it is borrowed in this app.
 * 
 * @author Hazel Soyeon Ahn
 *
 */

public class LibraryApp {
	
	public static void main(String[] args)
	{
		//Create an object array of Libary class
		//Decide how many arrays you want to make
		Library library = new Library(5);
		
		//Adding books to library
		library.addBook(new Book("The Lord of the Rings", "J. R. R. Tolkien"));
		library.addBook(new Book("Harry Potter and the Philospher's Stone", "J. K. Rowling"));
		library.addBook(new Book("1984", "George Orwell"));
		library.addBook(new Book("Where the Wild Things Are", "Maurice Sendak"));
		library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
		
		//Print out what books are in the library
		System.out.println(library);
		
		//Check if book has been borrowed
		Book aBook = library.borrow("1984");
		System.out.println("\nBook borrowed: " + aBook);
	}

}