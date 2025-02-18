package Collections;

import java.util.ArrayList;
import java.util.List;

public class Challenge {

	public static void main(String[] args) {
		
		List<String> healthyGroceries = new ArrayList<>();
		healthyGroceries.add("Chicken");
		healthyGroceries.add("Broccoli");
		healthyGroceries.add("Apples");
		healthyGroceries.add("Asperagus");
		
		List<String> unHealthyGroceries = new ArrayList<>();
		unHealthyGroceries.add("Pop-tarts");
		unHealthyGroceries.add("Reeses");
		unHealthyGroceries.add("Donuts");
		unHealthyGroceries.add("Tres Leches");
		
		healthyGroceries.addAll(unHealthyGroceries);
		
		System.out.println(healthyGroceries);
		
		for(String i : healthyGroceries) {
			if (i.equals("Donuts")) {
				healthyGroceries.remove(i);
				System.out.println(i);
			}
		}
		
		System.out.println(healthyGroceries);
	}
	
	
}
