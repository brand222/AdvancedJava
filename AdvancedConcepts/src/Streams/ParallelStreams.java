package Streams;

import java.util.ArrayList;

public class ParallelStreams {

	
	/*
	 * You can run iterations in parallel with Parallel Streams.
	 * Typically this is preferred with larger datasets, otherwise, 
	 * just stick with the regular stream().
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Book> books = populateLibrary();
		
		books.parallelStream().filter(book -> {
			return book.getAuthor().startsWith("J");
		}).forEach(System.out::println);
	}
	
	
	static ArrayList<Book> populateLibrary() {
		ArrayList<Book> bookCollection = new ArrayList();
		bookCollection.add(new Book("Alice Walker", "The Color Purple"));
		bookCollection.add(new Book("Alice Walker", "The Color Purple"));
		bookCollection.add(new Book("John Ellis", "Money Money Money"));
		bookCollection.add(new Book("Billy Bob Thorton", "The Hick"));
		bookCollection.add(new Book("Seinfeld", "Jock Strap"));
		bookCollection.add(new Book("Seinfeld", "Notebook"));
		bookCollection.add(new Book("Seinfeld", "Contest"));
		bookCollection.add(new Book("J. Thomas Johnson", "Girlfriend"));
		bookCollection.add(new Book("Stephen King", "Jack of all Trades"));
		bookCollection.add(new Book("Greta Merdina", "Jews"));
		bookCollection.add(new Book("Morry Povich", "Tennisman"));
		return bookCollection;
		
	}
	
}
