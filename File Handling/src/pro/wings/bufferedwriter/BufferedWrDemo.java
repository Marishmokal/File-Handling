package pro.wings.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrDemo {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("aaa.txt");
		BufferedWriter bw=new BufferedWriter(f);
		bw.write(100);
		bw.newLine();
		bw.write("urga solutions");
		bw.newLine();
		char[]ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("marish");
		bw.flush();
		bw.close();	
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
