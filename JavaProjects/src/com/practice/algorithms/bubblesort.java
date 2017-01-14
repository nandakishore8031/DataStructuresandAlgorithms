package com.practice.algorithms;

public class bubblesort {

	public static void main(String[] args){
	
		int[] arr = new int[]{3,1,4,5,2,7,6,8};
		//System.out.println("Current elements in array is " );

		System.out.println("length of aray is " + arr.length);
		
		/*int[] arr2 =*/ bubblesort1(arr);
		
		for(int i = 0; i < arr.length ; i++)
			System.out.println(arr[i]);
		
	}

	private static void bubblesort1(int[] arr) {
		// TODO Auto-generated method stub
		int temp ;
		System.out.println("Inside Bubble sort");
		long started = System.currentTimeMillis();
		for(int i = 0; i < arr.length -1 ; i++){
			
			for(int j = 0; j < arr.length -1 ; j++){
				
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp; 
				}
				
			}
			
		}
		System.out.println("Time took for execution is " + (System.currentTimeMillis() - started));		
		//return arr;
		
	}
	
	
	
}
