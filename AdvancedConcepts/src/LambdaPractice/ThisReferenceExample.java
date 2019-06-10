package LambdaPractice;

public class ThisReferenceExample {

	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);
		});
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//		thisReferenceExample.doProcess(10, i -> {
//			System.out.println("Value of i is " + i);
			//lambda does not override the this refence
			//this wont work
			//System.out.println(this);
//		});
		
		thisReferenceExample.execute();
		
		//		thisReferenceExample.doProcess(10, new Process() {
			
//			@Override
//			public void process(int i) {
//				System.out.println("Value of i is " + i);
//				//'this' is the instance of the class
//				System.out.println(this);
//			}
			
//			@Override
//			public String toString() {
//				return "This is the annonymous inner class";
//			}
			
//		});
	}
		public String toString() {
			return "This is the main ThisReferenceExample class instance";

	}
}
