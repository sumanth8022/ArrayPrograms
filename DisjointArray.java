package Com.cg;

public class DisjointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean dis = true;
		int[] arr= {1,4,5,6,7};
		int[] arr1= {8,9,10,11,8};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==arr1[j])
				{
					dis = false;
					break;
				}
			}
			
		}
		if(dis) {
			System.out.println("The Arrays is Disjoint");
		}
		else {
			System.out.println("The Arrays are not Disjoint");
		}
	}

}
