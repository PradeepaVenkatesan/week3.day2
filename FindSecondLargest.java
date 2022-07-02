package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		Set<Integer> data1 = new TreeSet<Integer>(data);
		System.out.println(data1);
		List<Integer> data2 = new ArrayList<Integer>(data1);
		int num = data.size()-2;
		System.out.println("Second Largest num:" +data2.get(num));
		
		}

	}


