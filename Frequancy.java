package HASHMAP;

import java.util.HashMap;

public class Frequancy {
public static void main(String[]args) {
	String str = "aaabbbcccddeeeffffksacd";
	int count = 0 ;
	char ch  ;
	HashMap<Character, Integer> occurance = new HashMap <Character, Integer>();
	 for (int i=0;i<str.length();i++) {
		 ch = str.charAt(i);
		 if (occurance.containsKey(ch)) {
			 count = occurance.get(ch);
			 count++;
			 occurance.replace(ch,count);
		 }
		 else {
			 occurance.put(ch,1);
	 }
	 }
	for (Character key :occurance.keySet()) {
		System.out.println(key + "="+ occurance.get(key));
	}
	
	
}
}
