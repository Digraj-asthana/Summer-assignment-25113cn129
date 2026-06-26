import java.util.*;
class program75 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix ");
        int row = sc.nextInt(), col = sc.nextInt();

        if (row <= 0 || col <= 0) {
            System.out.println("Please Enter positive values");
            sc.close();
            return;
        }

        int[][] mat = new int[row][col];

        System.out.println("Enter integer element of matrix ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}