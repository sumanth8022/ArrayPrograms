package Com.cg;

public class Code1 {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,5};
		int first =Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first ) {
				second = first;
				first = arr[i];
			}
			else if (arr[i]>second && arr[i]!=first ){
				second=arr[i];
				
			}
		}
		System.out.println("second largest Number is : " + second);

	}

}
