package day1;

public class SpiralMatrix {

    public static void main(String[] args) {

        // 2x4 integer matrix
        int[][] numMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        // 4x4 string matrix
        String[][] strMatrix = {
            {"aa", "ab", "ac", "ad"},
            {"ba", "bb", "bc", "bd"},
            {"ca", "cb", "cc", "cd"},
            {"da", "db", "dc", "dd"}
        };

        System.out.println("Spiral of 2x4 Number Matrix:");
        printSpiral(numMatrix);

        System.out.println("\nSpiral of 4x4 String Matrix:");
        printSpiral(strMatrix);
    }

    // Spiral for int matrix
    public static void printSpiral(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                // Right to Left
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                // Bottom to Top
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }

    // Spiral for string matrix
    public static void printSpiral(String[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}
