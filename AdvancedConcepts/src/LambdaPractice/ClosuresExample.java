package LambdaPractice;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		//b is considered an 'effectively final' variable
		//this basically means that since it is being used in a lambda
		//it CANNOT be changed. So it is final.
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
		
		
//		doProcess(a, new Process() {
//			
//			@Override
//			public void process(int i) {
//				System.out.println(i + b);
//				b = 40;
//			}
//		});
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	
}

interface Process {
	void process(int i);
}
