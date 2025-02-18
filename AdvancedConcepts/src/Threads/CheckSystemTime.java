package Threads;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckSystemTime implements Runnable {

	public void run() {
		Date rightNow;
		Locale currentLocale;
		DateFormat timeformatter;
		String timeOutput;

		rightNow = new Date();
		currentLocale = new Locale("en");

		timeformatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
		timeOutput = timeformatter.format(rightNow);

		System.out.println("time: " + timeOutput);
	}
}
