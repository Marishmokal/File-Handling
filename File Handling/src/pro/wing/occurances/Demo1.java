package pro.wing.occurances;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Demo1 {
public static void main(String[] args) throws Exception {
	Path p=Paths.get("aaa.txt");
	
	List<String>lines=Files.readAllLines(p);//readAllLines() present in Files utility class
	
	System.out.println(lines);
	System.out.println("Total number of lines"  +lines.size());
	
	List<String>words=new ArrayList<>();
	for (String line : lines) {
		
		line=line.trim();
		words.addAll(Arrays.asList(line.split(" ")));
	
	}
	
	System.out.println("total number of words:"+words.size());
	int charCount=0;
	for (String word : words) {
	
		charCount=charCount+word.length();
		
	}
	System.out.println("total number of character:"+charCount);
}

}
