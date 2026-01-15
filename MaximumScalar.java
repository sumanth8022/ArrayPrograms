package Com.cg;

import java.util.Arrays;

public class MaximumScalar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,7,9,3};
		int[] arr1= {4,5,10,44,8};
		int n = arr.length;
		Arrays.sort(arr1);
		Arrays.sort(arr);
		int prod =0;
		for(int i=0;i<n;i++) {
			prod +=arr[i]*arr1[i];
		}
		System.out.println("The maximum Scalar of the Arrays is : " + prod);
		

	}

}
