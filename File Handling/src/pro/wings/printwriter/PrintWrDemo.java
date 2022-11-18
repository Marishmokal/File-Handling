package pro.wings.printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWrDemo {
public static void main(String[] args) {
	 File f =new File("james.txt");
	 try {
		PrintWriter p=new PrintWriter(f);
		p.print(100);
		char[]ch= {'a','b'};
		p.print(ch);
		p.print(10.5);
		p.print(false);
		p.print("marish");
		p.flush();
		p.close();
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
