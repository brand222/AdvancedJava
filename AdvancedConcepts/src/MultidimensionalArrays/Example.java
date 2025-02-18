package MultidimensionalArrays;

public class Example {

	public static void main(String[] args) {

		// here we are initializing a multidimensional array
		//each 3 values represent rows
		
		//then we are using a nested for loop to print out the contents of the array
		int[][] scores = { { 400, 550, 600 }, { 475, 547, 439 }, { 625, 490, 510 } };
		//System.out.println("Scores!");
		
		String[][] movies = {{"transformers", "awesome"}, {"The Shining", "Scary"}, {"back to future", "scientific"}};
		
		for (int title = 0; title <= movies.length; title++) {
			for(int description = 0; description < movies[0].length; description++) {
				System.out.println(movies[title][description]);
			}
		}

		//this will go from 0 - 2 since there are 3 rows
//		for (int row = 0; row < scores.length; row++) {
//			//this represents the number of items in the rows
//			for (int col = 0; col < scores[0].length; col++) {
//				System.out.println(scores[row][col]);
//			}
//			System.out.println();
//		}
	}
}
