package com.git;

public class AppearsOneSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
        int len = arr.length;
        search(arr, len);
	}

	 static void search(int[] arr, int len) {
		int ans = -1;
        for (int i = 0; i < len; i += 2) {
            if (arr[i] != arr[i + 1]) {
                ans = arr[i];
                break;
            }
        }
       
        if (arr[len - 2] != arr[len - 1])
            ans = arr[len-1];
        System.out.println("The single element is " + ans);
		
	}

}
