package interview.coding.java.matrix;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] first = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] second = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                first[i][j] = first[i][j] + second[i][j];
            }
        }

        for (int i = 0; i <first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                System.out.print(first[i][j]+" ");
            }
            System.out.println();
        }

    }
}
