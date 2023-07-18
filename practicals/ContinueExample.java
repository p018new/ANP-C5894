package loops;
import java.util.Scanner;

class ContinueExample {
    public static void main(String[] args) {
        //input from the user
        Scanner sc = new Scanner(System.in);

        // Get the number of iterations from the user
        System.out.print("Enter the number of iterations: ");
        int iterations = sc.nextInt();

        // Perform a loop for the given number of iterations
        for (int i = 1; i <= iterations; i++) {
            // Check if the current iteration is divisible by 3
            if (i % 3 == 0) {
                // Skip this iteration and continue to the next one
                continue;
            }

            // Print the current iteration number
            System.out.println("Iteration: " + i);
        }

        sc.close();
    }
}
