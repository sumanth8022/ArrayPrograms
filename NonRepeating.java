package Com.cg;

import java.lang.constant.Constable;
import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
	public static Constable main(String[] args) {
		String str = "aaddcceff";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		 for(Map.Entry<Character,Integer> entry : map.entrySet())
	        {
	            if(entry.getValue()==1)
	                return entry.getKey();
	        }
		System.out.println(map);
		return str;
	
	
	}
}
