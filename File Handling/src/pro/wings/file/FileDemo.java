package pro.wings.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) throws IOException {
	
	File file=new File("marish.txt");
	System.out.println(file.exists());
	System.out.println(file.length());
	
	
////	file.mkdir();
////	System.out.println(file.exists());
//	file.isFile();
	}
}
