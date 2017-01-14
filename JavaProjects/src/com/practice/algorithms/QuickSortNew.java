package com.practice.algorithms;

public class QuickSortNew {

	
	private void quicksort(int[] arr2,int low, int high) {
		
		int pivot = arr2[low + (high - low)/2 ];
		int i = low, j = high;
		while(i <= j)
		{
			//System.out.println(i + " " + j);
			while(arr2[i] < pivot)
				i++;
			while(arr2[j] > pivot)
				j--;
			
			if(i <= j)
			{
				
				int temp = arr2[j];
				arr2[j] = arr2[i];
				arr2[i] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j)
			quicksort(arr2, low, j);
		if(high > i)
			quicksort(arr2, i, high);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = /*{3,2,4,6,5,1,7};*/ {4,3,6,5,24,65,8,34,68,23,54,76};
		
		System.out.println("Before Sorting");
		for(int item : arr)
			System.out.print(item + " ");
		System.out.println();
		
		QuickSortNew q = new QuickSortNew();
		
		q.quicksort(arr, 0, (arr.length -1));
		
		System.out.println("After Sorting");
		for(int item : arr)
			System.out.print(item + " ");
		
		
		

	}

}
