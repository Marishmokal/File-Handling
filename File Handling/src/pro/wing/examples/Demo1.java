package pro.wing.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo1 {
public static void main(String[] args) throws Exception {
	
		PrintWriter pw=new PrintWriter("File3.txt");
		BufferedReader br=new BufferedReader(new FileReader("file2.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			
			pw.println(line);
			line=br.readLine();
			}
	
	BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
	String line1=br1.readLine();
	while(line1!=null)
	{
		pw.println(line1);
		line1=br1.readLine();
	}
}
}
