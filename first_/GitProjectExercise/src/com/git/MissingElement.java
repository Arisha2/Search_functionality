package com.git;

public class MissingElement {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5};
		int N=arr.length+1;
		int result=MissingNumber(arr,N);
		System.out.print(result);

	}

	 static int MissingNumber(int[] arr, int n) {
		 int sum=0;
		 int total_sum = n * (n + 1) / 2;
			for(int i=0;i<n-1;i++) {
				sum=sum+arr[i];
			}
		return total_sum-sum;
	}

}
