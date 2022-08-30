package by.academy.classwork.lesson20;

public class MyThread implements Runnable {
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("Number:" + i);
		}
		System.out.println(Thread.currentThread().getName());
//		System.out.println("I'm done."+ getName());

	}

}
