package Com.cg;

import java.util.HashSet;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,6};
		int n = arr.length;
		int[] arr1 = {4,6,5,1};
		HashSet<Integer> set = new HashSet<>();
			for(int i=0;i<n;i++) {
				if(!set.contains(arr[i])) {
					set.add(arr[i]);
				}
			}
			boolean sub=true;
			for(int i =0;i<n;i++) {
				if(!set.contains(arr1[i])) {
					sub = false;
					break;
				}
			}
			if(sub) {
				System.out.println("It is a subset");
			}
			else {
				System.out.println("Not a subset");
			}
			

	}

}
