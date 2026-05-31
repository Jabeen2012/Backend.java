package com.array;

public class Longarray {

	public static void main(String[] args) {
		// Create a long array of size 3
        long[] numbers = new long[3];

        // Add values to the array
        numbers[0] = 100000L;
        numbers[1] = 200000L;
        numbers[2] = 300000L;

        // Print elements using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

	}


