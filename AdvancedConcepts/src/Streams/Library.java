package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class Library {

	public static void main(String[] args) {
//		ArrayList<Book> books = populateLibrary();
//		books.stream().filter(book -> {
//			return book.getAuthor().startsWith("D");
//		}).forEach(System.out::println);
		
		Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	}
		
	
	
//	static ArrayList<Book> populateLibrary() {
//		ArrayList<Book> books = new ArrayList();
//		books.add(new Book("John Wick", "Shooter"));
//		books.add(new Book("Michael Scott", "The office"));
//		books.add(new Book("Michael Scott", "Somehow I Manage"));
//		books.add(new Book("Dwight Schrute", "Assistant Regional Manager"));
//		books.add(new Book("Dwight Schrute", "Jan's Schedule"));
//		books.add(new Book("Ron Swanson", "Parks and Recreation"));
//		books.add(new Book("Ron Swanson", "WoodCutting and Crafting"));
//		books.add(new Book("Charlie Day", "Its Always Sunny in Philadelpia"));
//		books.add(new Book("Charlie Day", "The Nightman Cometh"));
//		books.add(new Book("Charlie Day", "Charlie's Will"));
//		return books;
//		
//	}
}
	
	
