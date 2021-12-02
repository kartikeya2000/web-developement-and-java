package stream;

import java.util.*;

public class Stream_methods {

	public static void main(String[] args) {
		// Stream methods
		//filter(Predicate)
		//map(function) method
		
		List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
		names.stream().filter(i->i.startsWith("D")).forEach(i->System.out.println(i));
		names.stream().filter(i->i.length()>5).forEach(i->System.out.print(i+" "));
		
		System.out.print("\n");
		//map function
		
		List<Integer> number = List.of(2,4,5,6,7,7,1,78,56);
		number.stream().map(i->i*i).forEach(i->System.out.print(i));
		
		System.out.print("\n");
	    
		//method reference
		number.stream().forEach(System.out::print);
		System.out.print("\n");
		
		// sort function
		number.stream().sorted().forEach(System.out::print);
		
		//min function
		
		System.out.print("\n");
		
		Integer minnum = number.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.print(minnum);
		
		
		
		
		
		
	}

}
