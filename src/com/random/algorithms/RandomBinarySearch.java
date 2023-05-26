package com.random.algorithms;

import java.util.Random;

public class RandomBinarySearch {
	/*
	 * This is a searching algorithm that works on the 
	 * concepts of Randomness and Binary Search. The function has two 
	 * parameters arr and k 
	 * 
	 * arr: array of elements
	 * k  : element to search
	 * 
	 * NOTE: Array must be sorted
	 */
	public int RandomBinarySearchAlgorithm(int[] arr, int k) {
		Random random = new Random();
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			// pick a random index within the current range
			int randomIndex = random.nextInt(right-left+1)+left;
			
			// get the element at the random index
			int randomElement = arr[randomIndex];
			
			if(randomElement == k) {
				// if found, return the position
				return randomIndex;
			} else if(randomElement < k) {
				// move to the right side of the array
				left = randomIndex + 1;
			} else {
				// move to the left side of the array
				right = randomIndex - 1;
			}
		}
		
		// if element is not found, return -1
		return -1;
	}
}
