package newfeatures;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	public static void main (String args[]) {
		
		List<String> languages =  new ArrayList<String>();
		
		languages.add("java");
		languages.add("python");
		languages.add("c#");
		languages.add("Scale");
		languages.add("ruby");
		
		System.out.println("****** Programming languages **********");
		languages.forEach(i -> System.out.println(i));
		
	}

	
}
