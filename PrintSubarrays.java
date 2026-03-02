package Com.cg;

public class PrintSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.println(arr[k] + " ");
				}
				System.out.println();				
			}
		}

	}

}
