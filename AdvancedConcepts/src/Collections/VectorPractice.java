package Collections;

import java.util.Vector;

//Vectors were included in the first release of java
//Their behavior is very similar to that of an ArrayList
//Vectors are not widely used and they performance isnt always ideal
public class VectorPractice {

	public static void main(String[] args) {
		
		String[] platform1 = {"PS4"};
		String[] platform2 = {"3DS", "Wii U"};
		
		VideoGame game1 = new VideoGame("Borderlands", 2011, "M", platform1);
		VideoGame game2 = new VideoGame("Super Mario World", 2009, "E", platform2);
		VideoGame game3 = new VideoGame("Uncharted 2", 2012, "T", platform1);
		
		//you dont specify the datatype for a vector initialization
		Vector videoGames = new Vector();
		
		videoGames.add(game1);
		videoGames.add(game2);
		videoGames.add(game3);
		
		System.out.println(videoGames);
	}
}
