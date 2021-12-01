package newfeatures;

import java.util.*;

public class Streamapiex {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book(101, "let us c", "Yashwant", "BPB", 8 );
		Book b2 = new Book(102, "Data communication", "Forouzan", "Mc Graw hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
				
				
	    list.add(b1);
		list.add(b2);
		list.add(b3);
		
		List<Integer>list1 = (List<Integer>) list.stream()
				             .filter(b -> b.quantity>7)
				             .map(b -> b.quantity);
				             

		  System.out.println(list1);
	}

}
