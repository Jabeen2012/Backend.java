package com.array;

public class Floatarray {

	public static void main(String[] args) {
		// Create a float array of size 4
        float[] numbers = new float[4];

        // Add values to the array
        numbers[0] = 1.1f;
        numbers[1] = 2.2f;
        numbers[2] = 3.3f;
        numbers[3] = 4.4f;

        // Print elements using foreach loop
        for (float num : numbers) {
            System.out.println(num);
        }
    }

	}


