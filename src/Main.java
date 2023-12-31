/**
 * The Main class demonstrates matrix multiplication between two matrices, m1 and m2.
 * It checks if multiplication is defined, performs the multiplication, and prints the result.
 */
public class Main {

    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] m2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        // Check if multiplication is defined based on matrix dimensions.
        if (m1[0].length != m2.length) {
            System.out.println("Multiplication is undefined");
        } else {
            int[][] result = multiply(m2, m1);

            // Print the result of matrix multiplication.
            for (int row = 0; row < result.length; row++) {
                for (int column = 0; column < result[0].length; column++) {
                    System.out.print(result[row][column] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * Multiply two matrices, mat1 and mat2, and return the result.
     *
     * @param mat1 The first matrix.
     * @param mat2 The second matrix.
     * @return The result of the matrix multiplication.
     */
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] answer = new int[mat1.length][mat2[0].length];

        for (int row = 0; row < mat1.length; row++) {
            for (int column = 0; column < mat2[0].length; column++) {
                for (int i = 0; i < mat1[0].length; i++) {
                    answer[row][column] += mat1[row][i] * mat2[i][column];
                }
            }
        }

        return answer;
    }
}
