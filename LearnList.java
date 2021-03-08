package learnjava;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Easwar");
		ls.add("Ramkumar");
		ls.add("Aravind");
		ls.add("Saheel");
		ls.add("Regunath");
		
		
//		count of the list
		System.out.println(ls.size());
		
//		to get the individual name
		String name = ls.get(2);
		System.out.println(name);
		
		System.out.println();
		
//		To verify if the name there r not
		boolean contains = ls.contains("Easwar");
		System.out.println(contains);
		
		for (String eachname : ls) {
			System.out.println(eachname);

		}
		System.out.println();
		ls.add("Ganesh");
		ls.add("Ramkumar");
//        for (String eachname: ls) {
//			System.out.println(eachname);
//		}
//        to remove the duplicate
		ls.remove("Ramkumar");
		for (String eachname : ls) {
			System.out.println(eachname);
		}
		
//        	to clear totally
		ls.clear();

		System.out.println(ls.isEmpty());

	}

}
