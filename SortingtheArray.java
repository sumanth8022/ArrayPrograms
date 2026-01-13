package Com.cg;

import java.util.TreeSet;

public class SortingtheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		int[] arr = {1,10,5,6,7,8};
		int n = arr.length;
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
