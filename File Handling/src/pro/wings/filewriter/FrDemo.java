package pro.wings.filewriter;//overriding data

import java.io.FileWriter;
import java.io.IOException;

public class FrDemo {
public static void main(String[] args) {
	FileWriter fw;
	try {
		fw = new FileWriter("abc.txt");
		fw.write(100);
		fw.write("urga\n softwareSolution");
		fw.write('\n');
		char[]ch= {'a','b','c','d','e','f','g','h'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}
