import java.util.Arrays;

public class ArrayConcepts {

    public static void main(String[] args) {
        // initialize and declaration of 1D Array
        int[] singleDimensionalArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(singleDimensionalArray));

        // initialize and declaration of 2D Array of 3 rows and 4 columns
        int[][] twoDimensionalArray = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.deepToString(twoDimensionalArray));
        System.out.println(twoDimensionalArray.length);
    }
}
