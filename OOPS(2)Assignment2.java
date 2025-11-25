/*Input Format

The two argument A and B are integer arrays that denote the length and breadth of the N rectangles respectively.

Output Format

Return an integer array where each element denotes the count of squares on the left with area greater than current rectangle area. */

// Main Solution class
public class Solution {

    // Function to solve the problem
    public int[] solve(int[] A, int[] B) {

        // Create an array of Rectangle objects
        Rectangle[] rect = new Rectangle[A.length];

        // Initialize each Rectangle object with length and breadth
        for (int i = 0; i < A.length; i++) {
            rect[i] = new Rectangle(A[i], B[i]);
        }

        // Result array to store the count for each rectangle
        int[] result = new int[A.length];

        // For each rectangle, count squares on the left with area > current rectangle's area
        for (int i = 0; i < A.length; i++) {

            int currentArea = rect[i].area();  // Area of current rectangle
            int count = 0;                     // Counter

            // Check all rectangles to the left of current index
            for (int j = 0; j < i; j++) {

                // Condition:
                // 1. Rectangle on left must be a square
                // 2. Its area must be greater than current rectangle area
                if (rect[j].isSquare() && rect[j].area() > currentArea) {
                    count++;
                }
            }

            // Store the count for this index
            result[i] = count;
        }

        // Return the final result array
        return result;
    }
}


// Rectangle class with required methods
class Rectangle {

    int length, breadth;

    // Constructor to initialize a rectangle
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Check if rectangle is a square
    boolean isSquare() {
        return length == breadth;
    }

    // Return area of rectangle
    int area() {
        return length * breadth;
    }

    // Check if area is greater than a given K
    boolean isAreaGreaterThan(int K) {
        return area() > K;
    }
}

