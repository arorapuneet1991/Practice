package interview.coding.java.matrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] first = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] second = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                second[j][i] = first[i][j];
            }
        }

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }
    }
}
