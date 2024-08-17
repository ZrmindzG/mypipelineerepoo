package mypack;

import java.util.HashMap;
import java.util.Map;

public class missingnumber {

	public static void main(String args[]) {
		String wd = "test,test,test1,test1,test2,test2";

		String[] wd1 = wd.split(",");

		Map<String, Integer> wds = new HashMap<String, Integer>();

		for (String words : wd1) {
			Integer wds1 = wds.get(words);
			for (int i = 0; i < wd1.length - 1; i++) {
				if (wd1[i] == null) {
					wds.put(words, 1);
				}
				else
				{
					wds.put(words, wds1+1);
				}
			}
			System.out.println("this is the missing number at 4th positions:");
		}
	}
}
