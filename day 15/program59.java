import java.util.Scanner;
public class program59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Please Enter positive n");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter integer element of array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if (n == 1)
        {
            System.out.println("It is single element array cannot rotate ");
            sc.close();
            return;
        }
        int lastEle = arr[n-1];
        for (int i = n-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = lastEle;
        System.out.println("Array after right rotation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}