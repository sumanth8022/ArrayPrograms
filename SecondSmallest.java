package Com.cg;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = {1,23,4,67,7,89};
		int n = arr.length;
//		int min = Integer.MAX_VALUE;
		  int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

	        for (int i=0; i < n; i++){
	            if(arr[i] < first)
	            { second = first; first = arr[i]; } 
	            else if(second>arr[i])
	           second = arr[i];
	        }
	        System.out.println(second);

	}

}
