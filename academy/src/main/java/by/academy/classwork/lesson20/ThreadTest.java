package by.academy.classwork.lesson20;

public class ThreadTest {

	public static void main(String[] args) {
		MyThread my1=new MyThread();
		Thread th1=new Thread(my1,"First");
		Thread th2=new Thread(my1);
		Thread th3=new Thread(my1);
		th1.start();
		th2.start();
		th3.start();

	}

}
