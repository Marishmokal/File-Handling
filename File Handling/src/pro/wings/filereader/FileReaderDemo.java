package pro.wings.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\File Handling\\src\\pro\\wings\\file\\marish.txt");
		FileReader fr=new FileReader(f1);
		
		
		try {
			int i=fr.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i=fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
