package pro.wings.filewriter;//append data

import java.io.FileWriter;
import java.io.IOException;

public class FwriterDemo {
public static void main(String[] args) {
	FileWriter fw;
	try {
		fw = new FileWriter("zzz.txt",false);
		fw.write(99);
		fw.write("urga\n softwareSolution");
		fw.write('\n');
		char[]ch= {'a','b','c'};
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
