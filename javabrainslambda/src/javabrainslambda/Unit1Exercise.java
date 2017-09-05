package javabrainslambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person ("Charles", "Dickens",60),
				new Person ("Lewis", "Carroll",42),
				new Person ("Thomas", "Carlyle",51),
				new Person ("Charlotte", "Bronte",45),
				new Person ("Matthew", "Arnold",39)
				);
		
		//Test Line
		// Test Line 2
		//Branch  1 line.
		

		//Branch 3

		//Branch 2 line

		Comparator<Person> cmpr = (p1, p2)  -> p1.getLastName().compareToIgnoreCase(p2.getLastName());
		people = sortPeople(people, cmpr);
		
		people.stream().forEach(p-> System.out.println(p));
		
		System.out.println("****");
		 
		 Predicate<Person> pr1 =  (Person p1)-> p1.getLastName().toUpperCase().startsWith("C");
	     people.stream().filter(pr1).forEach(p-> System.out.println(p));

	}
	
	

	public static List<Person> sortPeople(List<Person> lst, Comparator cmpr){
		
		Collections.sort(lst, cmpr);
		return lst;
		
	}
	

}
