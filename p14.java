class p14 {
    // Function to print the pattern of alphabets
    public void pattern14(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Inner loop to print alphabets from A to A + i
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p14 sol = new p14();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern14(N);  // Call the function to print the pattern
    }
}
class Solution {
    // Function to print the pattern of alphabets in a decreasing order
    public void pattern15(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Inner loop to print alphabets from A to A + (N-i-1)
            for (char ch = 'A'; ch <= 'A' + (N - i - 1); ch++) {
                System.out.print(ch + " ");  // Print the current character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;  // Set the size of the pattern (5 rows)
        sol.pattern15(N);  // Call the function to print the pattern
    }
}