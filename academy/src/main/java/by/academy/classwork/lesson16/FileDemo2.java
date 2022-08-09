package by.academy.classwork.lesson16;

import java.io.File;
//The root folder 
public class FileDemo2 {

	public static void main(String[] args) {
		File dirs = new File("./");
		if (!dirs.exists()) {
			dirs.mkdirs();

		}
		for (File f : dirs.listFiles()) {
			System.out.println("Name: " + f.getName());

		}
	}

}
