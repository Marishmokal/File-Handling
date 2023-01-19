package pro.wings.file;

import java.io.File;
import java.io.IOException;

public class Demo2 {
public static void main(String[] args) throws IOException {
	File f=new File("Jungle");
	f.mkdir();
	File f1=new File("Jungle","Sher");

	File f2=new File(f,"Sher");
	f1.createNewFile();
	System.out.println(f1.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f1.list());
	
}
}
