package com.syncronise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyncExample {

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	Object obj1 = new Object();
	Object obj2 = new Object();
	Random randGen = new Random();
	private  void first(){
		synchronized(obj1){
			list1.add(randGen.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}

		}
	}
	private void Second(){
		synchronized(obj2){
			list2.add(randGen.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}

		}		
	}
	private void processor(){
		for(int i=0;i<1000;i++){
			first();
			Second();
		}
	}
	public void main1() {
		System.out.println("START OF THREADS");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				processor();
			};
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				processor();
			};
		});
		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken = " + (end- start));
		System.out.println("print list2 size " + list2.size());
		System.out.println("print list1 size " + list1.size());
	}


}


