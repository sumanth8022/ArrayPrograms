package Com.cg;
public class Code3 {

    public static void main(String[] args) {
    	int [] arr = {1,2,3,4,5,6,7};
    	for(int n : arr) {
    		System.out.print(n +" ");
    	}
    	System.out.println();
    	int n = arr.length;
    	int k =3;
    	 k = k % n;
    	 int start =0 , end = n-1;
    	 while (start<end) {
    		 int temp = arr[start];
    		 arr[start] = arr[end];
    		 arr[end] = temp;
    		 start++;
    		 end--;
    	 }
    	 
    	 start = 0;
    	 end = k -1;
    	 while(start<end) {
    		 int temp = arr[start];
    		 arr[start] = arr[end];
    		 arr[end] = temp;
    		 start++;
    		 end--;
    	 }
    	 start = k;
    	 end = n -1;
    	 while(start < end ) {
    		 int temp = arr[start];
    		 arr[start] = arr[end];
    		 arr[end] = temp;
    		 start++;
    		 end--;
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 for(int num : arr) {
    		 System.out.print(num + " ");
    	 }
    	 
    	

       
       
    }
}