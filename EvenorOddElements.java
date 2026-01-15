package Com.cg;

public class EvenorOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,8,7,5};
		int n = arr.length;
		int even=0;
		int odd =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("The Count of Even elements is : " + even);
		System.out.println("The Count of Odd elements is : " + odd);
	}

}
