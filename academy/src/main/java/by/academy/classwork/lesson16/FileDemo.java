package by.academy.classwork.lesson16;

import java.io.File;
import java.io.IOException;
//create folder and show file in it
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File dirs=new File("myPackage");
		if(!dirs.exists()) {
			dirs.mkdirs();
			
		}
		File file=new File(dirs,"myFirstFile.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.isAbsolute());
		for(File f: dirs.listFiles()) {
			System.out.println("Name: "+f.getName());
			System.out.println("Path: "+f.getPath());
			
		}
	}

}
