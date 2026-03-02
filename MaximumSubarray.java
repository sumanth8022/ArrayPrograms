package Com.cg;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,4};
		int n  = arr.length;
		int maxsum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum = 0;
			
			for(int j=i;j<n;j++) {
				sum = sum + arr[j];
				
				if(sum>maxsum) {
					maxsum = sum;
				}
			}
		}
		System.out.println("The Maximum Sum of the Subarray is : " + maxsum);

	}

}
