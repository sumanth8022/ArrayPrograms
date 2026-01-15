package Com.cg;

import java.util.TreeSet;

public class DistinictElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		int[] arr = {4,5,6,7,8,4,5};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			ts.add(arr[i]);
		}

	System.out.println(ts);

	}

}
