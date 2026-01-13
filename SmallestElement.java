package Com.cg;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,3,5,7,8,11};
		int n =arr.length;
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The Smallest Elements is " + min);

	}

}
