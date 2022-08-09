package by.academy.classwork.lesson16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static final String INPUT_FILE_PATH = "src\\io\\file.txt";
	public static final String OUTPUT_FILE_PATH = "src\\io\\copied_file.txt";

	public static void main(String[] args) throws IOException {
		File dir = new File("src/io/");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File inputFile = new File(INPUT_FILE_PATH);
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		File outputFile = new File(OUTPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}
//		FileInputStream fileIn1 = new FileInputStream(inputFile);
//		FileOutputStream fileOut1 = new FileOutputStream(outputFile);
//		int a;
//		while((a=fileIn1.read())!=-1) {
//			System.out.println();
//			System.out.println((char) a);
//			if ((char) a == ' ') {
//				fileOut1.write('_');
//			} else {
//				fileOut1.write(a);
//			}
//		}
//		fileIn1.close();
//		fileOut1.close();                                     
		try (FileInputStream fileIn = new FileInputStream(inputFile);//try close automatically 
				FileOutputStream fileOut = new FileOutputStream(outputFile)) {
			int a;
			while ((a = fileIn.read()) != -1) {
				System.out.println((char) a);
				if ((char) a == ' ') {
					fileOut.write('_');
				} else {
					fileOut.write(a);
				}
			}
		}
	}

}
