package com.random.algorithms;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 7, 3, 9, 6, 8, 4};
		int k1 = 8;
		int k2 = 7;
		
		RandomSearch rs = new RandomSearch();
		
		int p1 = rs.RandomSearchAlgorithm(arr, k1);
		int p2 = rs.randomSearchAlgorithmOptimized(arr, k2);
		
		if(p1 != -1) {
			System.out.println("Position: " + p1);
		} else {
			System.out.println("Element not found.");
		}
		
		if(p2 != -1) {
			System.out.println("Position: " + p2);
		} else {
			System.out.println("Element not found.");
		}
	}

}
