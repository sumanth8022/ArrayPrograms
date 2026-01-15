package Com.cg;

import java.util.Arrays;

public class FrequencyOfelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,1,6,7,8};
		int n = arr.length;
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " "+count);
		}
		
		
		

	}

}
