package com.example.javaCourse.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int [] arr= {1,7,9,8,3,4};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int swap=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=swap;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
