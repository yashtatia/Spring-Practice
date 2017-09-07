import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customer {

	public List<String> sort(String[] input) {
		// Student code begins here

		List<String> list1 = new ArrayList<String>();
		if(input.length==0) return list1;
		for (String word: input) list1.add(word);
		Collections.sort(list1, new Comparator<String>(){
			public int compare(String s1, String s2){
				return s1.length()-s2.length();
			}
		});
		return list1;
		
		// Student code ends here
		
	}

	public void printSorted(String[] input) {
		System.out.println(sort(input));
	}

	public static void main(String[] args) {

		Customer obj = new Customer();
		obj.printSorted(args);
	}
}