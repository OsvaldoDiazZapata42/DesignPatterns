package Prototype;

public class CreationalPrototypeDemo {

	public static void main(String[] args) {

		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns");

		printMovie(movie);

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Creational Patterns 2");

		printMovie(anotherMovie);
		
		System.out.println(movie == anotherMovie); //false

	}

	public static void printMovie(Movie movie) {
		System.out.println(movie);
		System.out.println(movie.getRunTime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
	}

}
