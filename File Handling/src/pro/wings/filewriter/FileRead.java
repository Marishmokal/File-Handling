package pro.wings.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) throws IOException {
	File f=new File("xyz.txt");
	
	try {
		FileReader fr = new FileReader(f);
			int i=fr.read();
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fr.read();
			}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
