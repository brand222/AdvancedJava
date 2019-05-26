package Threads;
import java.util.*;
import java.text.DateFormat;

//inhert from Thread superclass
public class ThreadPractice1 extends Thread {

	public void run() {
		Date rightNow;
		Locale currentLocale;
		DateFormat timeformatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for(int i = 1; i <= 20; i++) {
			//set it equal to a Date Object
			rightNow = new Date();
			//english code for Locale - passing in 'en'
			currentLocale = new Locale("en");
			timeformatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			timeOutput = timeformatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
