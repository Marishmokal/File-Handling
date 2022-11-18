package pro.wings.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
public static void main(String[] args) throws IOException {
	File f =new File("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\File Handling\\src\\pro\\wings\\filereader\\xyz.txt");
	char[]ch=new char[(int) (f.length())];
	
	try {
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
