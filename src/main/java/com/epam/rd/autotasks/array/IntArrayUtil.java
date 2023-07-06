package com.epam.rd.autotasks.array;

import java.util.Arrays;

public class IntArrayUtil {

	public static void swapEven(int[] array) {
		// TODO: Implement this method.
		int start = 0;                         // Start index
		int end = array.length - 1;            // End index

		while (start < end) {
			// Check if both values at start and end indices are even
			if (array[start] % 2 == 0 && array[end] % 2 == 0) {
				// Swap the even values
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
			}

			// Move to the next pair of indices
			start++;
			end--;
		}
	}


	public static void main(String[] args) {
		/*{
			int[] array = null;
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[]{};
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}*/
		{
			int[] array = new int[]{10, 5, 3, 4};
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[]{100, 2, 3, 4, 5};
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[]{100, 2, 3, 45, 33, 8, 4, 54};
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
	}
}


		// Main method to test the swapEven method
	/*	public static void main(String[] args) {

			// Create an array of integers
			int[] nums = {2, 7, 4, 9, 6, 3, 8};

			// Print the original array
			System.out.println("Original array:");
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();

			// Call the swapEven method
			swapEven(nums);

			// Print the modified array
			System.out.println("Modified array:");
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		}*/

		// Method to swap even values in the array

