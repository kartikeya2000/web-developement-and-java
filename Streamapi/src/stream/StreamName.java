package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// * NEW METHOD TO MAKE LIST(IT IS INMUTABLE)
		 
		  List<Integer> list1 = List.of(2,4,5,6,7,8,7,70,45,67,34,12); 
		  System.out.println(list1);
		

		
		
		/*
		 * List<Integer> list1 = new ArrayList<>(); list1.add(2); list1.add(3);
		 * list1.add(4); list1.add(5);
		 * System.out.println(list1);
		 */
		 
		/*
		 * List<Integer> list2 = Arrays.asList(23,345,567,78);
		 * System.out.println(list2);
		 */
		  
		  
		/*
		  * Stream<Integer>stream = list1.stream();
		 * stream.filter(i->i>6).forEach(i->System.out.println(i));
		 */
		  
		/*
		 * list1.stream().filter(i->i>6).forEach(i->System.out.println(i));
		 * Stream<Object> streambuilder = Stream.builder().build();
		 */
		 
	
		  
		  
	}

}
