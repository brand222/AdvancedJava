package Threads;

import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck {

	
	private String checkWhat;
	
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkWhat) {
		this.checkWhat = checkWhat;
	}
	
	public void run() {
	lock.lock();
	
	System.out.println("Checking" + this.checkWhat);
	
	lock.unlock();
	}
	
}
