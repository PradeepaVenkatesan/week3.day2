package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> input1 = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(11);
		input.add(4);
		input.add(6);
		input.add(7);
		input1.add(1);
		input1.add(2);
		input1.add(8);
		input1.add(4);
		input1.add(9);
		input1.add(7);
		List<Integer> input2 = new ArrayList<Integer>(input1);
 		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input1.size(); j++) {
				if (input.get(i)==input1.get(j)) {
					System.out.println("Intersection number:" +input2.get(i));
				}
			}
		}
	}
}
