package pro.wings.bufferesreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReDemo {
public static void main(String[] args) throws IOException {
	FileReader f;
	try {
		f = new FileReader("C:\\Users\\Shree\\git\\File-Handling\\File Handling\\abc.txt");
		BufferedReader br=new BufferedReader(f);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
			br.close();
		}
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
