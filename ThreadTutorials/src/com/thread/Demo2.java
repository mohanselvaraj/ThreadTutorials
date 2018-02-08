package com.thread;

class Thread1 extends Thread{
	public void run(){
		System.out.println("thread 1 run");
		try {
			Thread.sleep(5000);
			//Thread.sleep(3000);
			System.out.println("Runnable takes 5 secs myline....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread 2 run");
		try {
			Thread.sleep(3000);
			//Thread.sleep(3000);
			System.out.println("Runnable takes 3 secs myline....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Thread statement for Thread before");
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 myrun = new Thread2();
		Thread t2 = new Thread(myrun);
		t2.start();
		Thread t3 = new Thread(new Runnable(){
         
			@Override
			public void run() {
				System.out.println("thread 3 run");
				try {
					Thread.sleep(1000);
					//Thread.sleep(3000);
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
			t3.join();;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed all threads");

	}

}
