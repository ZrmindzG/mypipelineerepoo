package mypack;

import java.util.HashMap;
import java.util.Map;

public class Duplicatewordcountinastring {

	public static void main(String[] args) {
		String str = "Test Test dev Test Test dev Test doc Test dev dev dev Test Test dev dev Test";
		//String str="i,i,i,love,love,love,india,india,india";

		String[] words = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String w : words) {
			Integer oldmv = map.get(w);

			if (oldmv == null) {
				oldmv = 0;
			} 
			map.put(w, oldmv + 1);
			
			System.out.println(map);

		}

	}

}
