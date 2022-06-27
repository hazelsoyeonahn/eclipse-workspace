package examples;
/**
 * The MovieApp uses the MovieLibrary and Movie classes to
 * instantiate and populate a library of three movies.
 * 
 * What would happen if you changed the numbnerOfMovies instance variable to 5?
 * e.g. library.numberOfMovies = 5;
 * 
 * */
public class MovieApp {

	public static void main(String[] args) 
	{
		MovieLibrary library = new MovieLibrary();
		
		//initialise the array to store three movies.
		library.movies = new Movie[3];
		library.numberOfMovies = 3;
		
		//create and "add" the movie objects to the library using
		//one of the three possible Movie constructors.
		library.movies[0] = new Movie("The Third Man",5);
		
		library.movies[1] = new Movie("Batman");
		library.movies[1].rating = 3;
		
		library.movies[2] = new Movie();
		library.movies[2].title = "Casablanca";
		library.movies[2].rating = 5;

		System.out.println("Movie library contents");
		for(int i=0;i<library.numberOfMovies;i++)
		{
			System.out.println("Movie title: "+library.movies[i].title);
			System.out.println("Movie rating: "+library.movies[i].rating);
		}
	}

}
