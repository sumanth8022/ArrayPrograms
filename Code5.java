package Com.cg;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,0,6,0,7,0};
		

        int pos = 0; 
        
        
//        for(int i=0;i<arr.length-1;i++) {
//        	if(arr[i]!=0) {
//        		arr[pos] = arr[i];
//        		pos++;
//        	}
//        }
//        while(pos<arr.length) {
//        	arr[pos] = 0;
//        	pos++;
//        }
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=0) {
        		int temp = arr[i];
        		arr[i] = arr[pos];
        		arr[pos] = temp;
        		pos++;
        	}
        }
        
        
        for(int num : arr) {
        	System.out.print(num + " ");
        }

	}

}
