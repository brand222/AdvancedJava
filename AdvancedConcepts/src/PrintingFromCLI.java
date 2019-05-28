import java.util.Arrays;

public class PrintingFromCLI {

	public static void main(String[] args) {
	int[] arrayToPrint = {3,1,5,67,41,4,5,8};
	
	Arrays.sort(arrayToPrint);
	
	for(int i : arrayToPrint) {
		System.out.println(i);
	}

	}

}
