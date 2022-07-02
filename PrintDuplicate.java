package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicate {
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(14);
		input.add(12);
		input.add(13);
		input.add(11);
		input.add(15);
		input.add(14);
		input.add(18);
		input.add(16);
		input.add(17);
		input.add(19);
		input.add(18);
		input.add(17);
		input.add(20);
		System.out.println(input);
		for (int i = 0; i < input.size(); i++) {
			for (int j = i+1; j < input.size(); j++) {
				if (input.get(i)==input.get(j)) {
					System.out.println("Duplicate Number:" +input.get(j));
				}
				
			}
			
		}
		
	}

}
