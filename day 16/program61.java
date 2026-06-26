import java.util.*;
class program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        if (length < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        int[] arr = new int[length];

        System.out.println("Enter integer element of array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        int missingNum = ((length+1)*(length+2)/2) - sum;
        System.out.println("Missing number is " + missingNum);

        sc.close();
    }
}