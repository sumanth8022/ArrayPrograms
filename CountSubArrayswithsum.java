package Com.cg;

public class CountSubArrayswithsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		int k =3;
		int n = arr.length;
		int count =0;
		for(int i=0;i<n;i++) {
			int sum =0;
			for(int j=i;j<n;j++) {
				sum = sum + arr[j];
				if(sum == k) {
					count++;
					}
			}
			
		}
		System.out.println("Total Sub Arrays which is equal sum k : " + count);

	}

}
