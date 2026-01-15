package Com.cg;

public class MinimumScalar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,4,5,6};
		int n =arr.length;
		int[] arr1 = {8,9,5,6};
		int m = arr1.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}}
			for(int i=0;i<m;i++) {
				for(int j=i+1;j<m;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j]= temp;
					}
				}
		}
			int prod =0;
			for(int i=0;i<n-1;i++) {
				prod +=arr[i]*arr1[i];
			}
			System.out.println("The Minimum Scalar of the Array is : " + prod);
	}

	

}
