package com.practice.algorithms;

public class expt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int i = 2,j=4;
		System.out.println(i + " " + j);
		
		i = i+j;
		j = i-j;
		i = i-j;
		
		System.out.println(i + " " + j + " " +i + " " + j);
		*/
		int arr2[] = {2,4};		
		int i =0,j=1;
		arr2[i] = arr2[i] + arr2[j];
		arr2[j] = arr2[i] - arr2[j];
		arr2[i] = arr2[i] - arr2[j];
		System.out.println(arr2[i] + " " + arr2[j]);
		
		
	}

}
