package pro.wings.printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWrDemo2 {
public static void main(String[] args) {
	 File f =new File("marish.txt");
	 try {
		PrintWriter p=new PrintWriter(f);
		p.println(100);
		char[]ch= {'a','b'};
		p.println(ch);
		p.println(10.5);
		p.println(false);
		p.println("marish");
		p.flush();
		p.close();
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
