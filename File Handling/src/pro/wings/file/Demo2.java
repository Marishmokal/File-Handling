package pro.wings.file;

import java.io.File;
import java.io.IOException;

public class Demo2 {
public static void main(String[] args) throws IOException {
	File f=new File("Rushikesh");
	f.mkdir();
	File f1=new File("Rushikesh","shree");

	File f2=new File(f,"shree");
	f1.createNewFile();
	System.out.println(f1.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f1.list());
	
}
}
