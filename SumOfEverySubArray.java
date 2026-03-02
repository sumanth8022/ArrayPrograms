package Com.cg;

public class SumOfEverySubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		int n = arr.length;
		
		for(int i=0;i<n;i++ )
		{
			int sum =0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
				System.out.println(sum);
			}
			
			
		}

	}

}
