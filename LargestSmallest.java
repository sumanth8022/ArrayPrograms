package Com.cg;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,4,5,7,8,9};
		int n = arr.length;
		int min=arr[0];
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The largest number is : " + max);
		System.out.println("The smallest number is : " + min);
	}

}
