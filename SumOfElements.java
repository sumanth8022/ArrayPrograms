package Com.cg;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,45,6,8};
		int n =arr.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		System.out.println("The sum of elements is : " + sum);

	}

}
