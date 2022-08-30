package by.academy.classwork.lesson20;

public class MyThread2 extends Thread  {
	
	public MyThread2() {
		super();
	}
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("Number:" + i);
		}
		System.out.println(Thread.currentThread().getName());
	}



}
