package Threads;

public class MainClass {

	public static void main(String[] args) {
		Thread getTime = new ThreadPractice1();
		
		Runnable getmail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(20);
		
		getTime.start();
		
		new Thread(getmail).start();
		
		new Thread(getMailAgain).start();
	}
}
