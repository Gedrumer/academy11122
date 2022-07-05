package by.academy.classwork.lesson8;


public abstract class Test {

	public static void main(String[] args) {
		Phone ph = new Phone();
		ph=new Phone("NAMA","NANANA");
		ph.recieveCall("nana","123123123");
		System.out.println(ph.number);
		System.out.println(ph.model);
		ph.sendMessageñ("asdad","123","1234","123445");
	}

}
