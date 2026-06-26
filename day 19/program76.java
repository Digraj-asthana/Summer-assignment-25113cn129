import java.util.*;
class program76 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square matrix dimension");
        int dim = sc.nextInt();

        if (dim <= 0) {
            System.out.println("Please Enter correct values");
            sc.close();
            return;
        }

        int[][] mat = new int[dim][dim];

        System.out.println("Enter integer element of matrix ");
        for (int i = 0; i < dim; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix ");
            for (int j = 0; j < dim; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < dim; i++) {
            sum += mat[i][i];  

            if (i != (dim - 1 - i)) {
                sum += mat[i][dim - i - 1];
            }
        }

       System.out.println("The diagonal element sum is " + sum);

        sc.close();
    }
}