import java.util.*;
class program14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the fibonacci series to be searched:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("The nth element in the fibonacci series is: " + arr[n-1]);
    }
}