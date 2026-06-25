import java.util.*;
class program13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the fibonacci series:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("The fibonacci series is:");
        for(int i=0; i<n; i++)   
     {
            System.out.print(arr[i] + " ");
        }
    }
}