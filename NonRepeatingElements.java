package Com.cg;

import java.util.HashMap;

public class NonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,7,5,6,7,8,8};
		int n = arr.length;
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i],1);
			}
		}
	for(HashMap.Entry<Integer,Integer> entry : mp.entrySet())
	{
		if(entry.getValue()==1) {
			System.out.println(entry.getKey() + " ");
		}
	}
	}

}
