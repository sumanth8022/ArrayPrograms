package Com.cg;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,24,6,7,89};
		int n = arr.length;
		int max =arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The largest Number is : " + max);
	}

}
