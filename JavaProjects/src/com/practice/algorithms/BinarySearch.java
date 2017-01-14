package com.practice.algorithms;

public class BinarySearch {

	
	private int binarysearch(int[] arr, int key){
		
		int mid = 0;
		int start = 0;
		int end = arr.length -1 ; 
		while(true){
					
			mid = (start+end)/2;
			if(key == arr[mid]){
				return mid;
			}
			else if(key < arr[mid])
				end = mid -1;
			else 
				start  = mid + 1 ;
			
			return -1;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		
		int key = 10;
		
		BinarySearch bs = new BinarySearch();
		long st = System.currentTimeMillis();
		int position = bs.binarysearch(arr,key);
		
		System.out.println(position);
		System.out.println(System.currentTimeMillis() - st);
		
		
	}

}
