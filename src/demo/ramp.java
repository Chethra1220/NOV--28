package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ramp {
	
	public static void main(String[] args) {

  String name = "I am from Mumbai";
  char[] charArray = name.toCharArray();
  Map<Character, Integer> mp = new HashMap<Character, Integer>();
  for (int i = 0; i < charArray.length; i++) {
	  char c = charArray[i];
	  if ((c >='a'&& c<='z')||(c>='A'&&c<='Z')) {
		  if (mp.containsKey(c)) {
			  Integer integer = mp.get(c);
			  
			  mp.put(c, integer+1);
			}
		  else {
				mp.put(c, 1);
	
			
		}
		
	
	  
	}
  Set<Entry<Character,Integer>> entrySet = mp.entrySet();
  for (Entry<Character, Integer> entry : entrySet) {
	  System.out.println(entry);
	
 
	  
	
}
	 
  
  


		
		
		
	}

}
