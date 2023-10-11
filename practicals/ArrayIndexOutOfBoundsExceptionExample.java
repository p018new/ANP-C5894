package collection; // use a different name for the package

import java.util.Scanner; // import the Scanner class to get user input

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // read the size of the array from the user

        // validate the size
        while (size <= 0) { // loop until the size is positive
            System.out.println("Error: Size must be positive!"); // display an error message
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt(); // read the size again
        }

        int[] array = new int[size]; // create an array of integers with the given size

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) { // loop through each index of the array
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt(); // read an element from the user and store it in the array
        }

        System.out.print("Enter an index to retrieve an element: ");
        int index = scanner.nextInt(); // read an index from the user

        // validate the index
        while (index < 0 || index >= size) { // loop until the index is within the bounds of the array
            System.out.println("Error: Index must be between 0 and " + (size - 1) + "!"); // display an error message
            System.out.print("Enter an index to retrieve an element: ");
            index = scanner.nextInt(); // read the index again
        }

        try {
            int element = array[index]; // try to access the element at the given index
            System.out.println("Element at index " + index + ": " + element); // display the element
        } catch (ArrayIndexOutOfBoundsException exception) { // catch any exception that may occur due to invalid index
            System.out.println("Error: Array index out of bounds!"); // display an error message
        } finally {
            scanner.close(); // close the scanner in a finally block to avoid resource leak
        }
    }
}
