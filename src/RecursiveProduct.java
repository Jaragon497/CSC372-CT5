import java.util.Scanner;

public class RecursiveProduct {
    // This value determines how long the initial array is allowed to be
    static int limit = 5;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] number_arr = new int[limit];

        System.out.println("Enter " + limit + " numbers.");

        for (int i = 0; i < limit; i++) {
            System.out.print("Number " + (i + 1) + " >> ");
            number_arr[i] = scnr.nextInt();
        }

        int product = multiply(number_arr, 0);
        System.out.println("The product of the provided numbers is: " + product);
    }

    private static int multiply(int[] nums, int idx) {
        // !!BASE CASE -> If the index is the last value in
        //  the array, return the value at the last index
        if (nums.length - 1 == idx) {
            return nums[idx];
        }
        // Else, return the number at current index multiplied
        //  by a recursive call to the multiply function
        else {
            return nums[idx] * multiply(nums, idx + 1);
        }
    }
}
