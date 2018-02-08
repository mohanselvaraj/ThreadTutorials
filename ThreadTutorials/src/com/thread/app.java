package com.thread;

import java.util.Scanner;

class RunnerClass implements Runnable{
	 volatile boolean stopThread = false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(stopThread == false){
			System.out.println("print hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void letsStop(){
		stopThread = true;
		
	}
}
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnerClass runn = new RunnerClass();
		Thread t1 = new Thread(runn);
		t1.start();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		runn.letsStop();
		
		
	}

}
