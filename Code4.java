package Com.cg;

import java.util.HashSet;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,45,6,2,3,4};
		HashSet<Integer>  set = new HashSet<>();

		HashSet<Integer>  dpset = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				dpset.add(arr[i]);
			}
			else {
				set.add(arr[i]);
			}
		}
		for(int num : dpset) {
			System.out.print(num + " ");
		}
	}

}
