package com.chetan;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,10};
		System.out.println(findElement(arr, 10));
	}
	
	static int findElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(target < arr[mid] ) {
				end= mid-1;
			} else if(target > arr[mid]) {
				start = mid +1;
			} else {
				return mid;
			}
		}
		return -1;
		
	}
	

}
