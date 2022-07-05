package by.academy.classwork.lesson8;

public class Phone {
//	к) Создать метод sendMessageс аргументами переменнойx длины(varargs). Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//	л) Изменить класс Phone в соответствии с концепцией JavaBean. 

	String number;
	String model;
	double weight;
	String name;

	public void recieveCall(String name) {
		name = name;
		System.out.println("Call" + name);
	}

	public void getNumber(String number) {
		number = number;
		System.out.println("Call" + number);
	}

	public Phone(String number, String model, double weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;
	}

	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {

	}

	public void recieveCall(String name, String number) {
		name = name;
		number = number;
		System.out.println("Call " + name + " number: " + number);
	}
	public void sendMessageс(String...args) {
		this.number=number;
		System.out.println(number);
	}

}
