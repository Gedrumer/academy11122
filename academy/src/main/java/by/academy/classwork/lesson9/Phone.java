package by.academy.classwork.lesson9;

import java.util.Arrays;

public class Phone {
	String number;
	String model;
	double weight;

	public void setNumber(String number) {
		this.number = number;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getNumber() {
		return number;

	}

	public String getModel() {
		return model;

	}

	public double getWeight() {
		return weight;

	}

	public void getNumbers(String number) {
		number = number;
		System.out.println("Phone number: " + number);
	}

	public void receiveCall(String name) {
		name = name;
		System.out.println("Call: " + name);
	}

	public Phone(String number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {

	}

	public void receiveCall(String name, String number) {
		name = name;
		number = number;
		System.out.println("Call: " + name + ". Number: " + number);
	}

	public void sendMessageс(String... numbers) {
		System.out.println("Nmbers: " + Arrays.toString(numbers));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Phone that = (Phone) obj;

		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(that.weight)) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone weight: ");
		builder.append(weight);
		builder.append(", model: ");
		builder.append(model);
		builder.append(", number: ");
		builder.append(number);
		builder.append(".");
		return builder.toString();

	}

}
