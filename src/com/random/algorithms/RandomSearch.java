package com.random.algorithms;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class RandomSearch {
	/*
	 * This is a searching algorithm that works on the 
	 * concept of Randomness. The function has two 
	 * parameters arr and k 
	 * 
	 * arr: array of elements
	 * k  : element to search
	 */
	public int RandomSearchAlgorithm(int[] arr, int k) {
		Random random = new Random();
		int n = arr.length;
		
		while(true) {
			int randomIndex = random.nextInt(n); // pick a random index
			int randomElement = arr[randomIndex]; // get element at the random index
			
			if(randomElement == k) {
				// if element is found, return its position
				return randomIndex;
			} else {
				// mark element as visited
				arr[randomIndex] = Integer.MAX_VALUE;
				boolean allVisited = true;
				
				// check if all elements have been visited
				for(int i = 0; i < n; i++) {
					if(arr[i] != Integer.MAX_VALUE) {
						allVisited = false;
						break;
					}
				}
				
				if(allVisited) {
					/*
					 * if element is not present in the array.
					 * all elements have been visited.
					 */
					return -1;
				}
			}
		}
	}
    public int randomSearchAlgorithmOptimized(int[] arr, int k) {
        Random random = new Random();
        int n = arr.length;
        Set<Integer> visitedIndices = new HashSet<>();
        
        while (visitedIndices.size() < n) {
            int randomIndex = random.nextInt(n); // pick a random index
            
            if (!visitedIndices.contains(randomIndex)) {
                visitedIndices.add(randomIndex);
                int randomElement = arr[randomIndex]; // get element at the random index
                
                if (randomElement == k) {
                    // if element is found, return its position
                    return randomIndex;
                }
            }
        }
        
        // Element not found
        return -1;
    }
}
