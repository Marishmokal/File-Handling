package pro.wings.file;

import java.io.File;

public class Demo4 {
public static void main(String[] args) {
	int count=0;
	File f=new File("C:\\Users\\Shree\\OneDrive\\Pictures\\Grp pics");
	String[]s=f.list();
	
	for(String j:s)
	{
		count++;
		System.out.println(s);
	}
	System.out.println(count);
}
}
