package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurance {
	public static void main(String[] args) {
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : input) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);				
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}

}
