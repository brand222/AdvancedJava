package Collections;

import java.util.ArrayList;

public class ArrayListPractice {

	//ArrayLists implement the List interface
	//They are the most frequently used data structure
	//They create an object array that grows as needed
	
	//you can add null values
	//it is not thread safe
	//They can add quick access to elements based on index
	//Developers can add or remove elements by index value
	
	//Easily find the index of the first occurance of an element
	//The inital size capacity can be set when created
	//the trimTo() method can reduce the size
	public static void main(String[] args) {
		String[] platform1 = {"PS4"};
		String[] platform2 = {"3DS", "Wii U"};
		
		VideoGame game1 = new VideoGame("Borderlands", 2011, "M", platform1);
		VideoGame game2 = new VideoGame("Super Mario World", 2009, "E", platform2);
		VideoGame game3 = new VideoGame("Uncharted 2", 2012, "T", platform1);
		
		ArrayList<VideoGame> games = new ArrayList<VideoGame>();
		games.add(game1);
		games.add(game2);
		games.add(0,game3);
		System.out.println(games);
		}
	}
