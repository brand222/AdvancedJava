package LambdaPractice;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> printMessage());
		Thread j = new Thread(MethodReferenceExample1::printMessage);
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
