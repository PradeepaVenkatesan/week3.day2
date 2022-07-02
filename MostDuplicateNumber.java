package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicateNumber {
	public static void main(String[] args) {
		String input = "abbaba";
		int max = 0;
		char num = input.charAt(0);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] array = input.toCharArray();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
			if (map.get(array[i])>max) {
				num = array[i];
				max = map.get(array[i]);				
			}
		}
		System.out.println("First Most Duplicate char:"+num);
			}

}
