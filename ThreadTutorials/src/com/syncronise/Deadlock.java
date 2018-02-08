package com.syncronise;

class Runner1 implements Runnable{

	@Override
	public void run() {

		System.out.println("Inside run1");
		synchronized(Deadlock.obj1){
			System.out.println("locked obj1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Deadlock.obj2){
				System.out.println("locked object2 inside obj1 ");
			}
		}
	}

}
class Runner2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run2");
		synchronized(Deadlock.obj2){
			System.out.println("locked obj2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Deadlock.obj1){
				System.out.println("locked object1 inside obj2 ");
			}
		}

	}

}
public class Deadlock {
	public static  Object obj1 = new Object();
	public static  Object obj2 = new Object();

	public static void main(String[] args) {
		System.out.println("*******");
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		t1.start();
		t2.start();
	}

}
