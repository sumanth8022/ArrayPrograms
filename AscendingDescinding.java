package Com.cg;

import java.util.Arrays;

public class AscendingDescinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,3,6,5};
		int n =arr.length;
		Arrays.sort(arr);
		System.out.println("array after sorting");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array after sorting ascending and descending");
		for(int i=0;i<n/2;i++) {
			System.out.print(arr[i]+ " ");
		}
		for(int i=n-1;i>=n/2;i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
