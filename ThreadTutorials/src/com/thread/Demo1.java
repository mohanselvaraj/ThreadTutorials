package com.thread;

class MyThread extends Thread{
	public void run(){
		try {
			System.out.println("thread during myline....");
			Thread.sleep(5000);
			System.out.println("takes 5 secs myline....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Runnable myline....");
			Thread.sleep(3000);
			System.out.println("Runnable takes 3 secs myline....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		System.out.println("before myline....");
		MyThread t1 = new MyThread();
		t1.start();
	System.out.println("myline t1....");
	MyRunnable runnable = new MyRunnable();
	Thread t2 = new Thread(runnable);
	
	t2.start();
	System.out.println("myline t2....");
	 Thread t3 = new Thread(new Runnable(){
	    	public void run() {
	    		try {
	    			System.out.println("Runnable myline....");
	    			Thread.sleep(1000);
	    			System.out.println("Runnable takes 1 secs myline....");
	    		} catch (InterruptedException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    });
	    
		
		t3.start();
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
	System.out.println("myline t3...."); 
	
	System.out.println("completed");

	}

}
