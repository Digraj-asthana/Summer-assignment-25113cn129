import java.util.*;
class program60
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n =sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        if (n == 1)
        {
            System.out.println("Single element array, no shifting required");
            sc.close();
            return;
        }
        int count = 0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != 0) 
            {
                arr[count++] = arr[i];
            }
        }
        while (count < n) 
        {
            arr[count++] = 0;
        }
        System.out.println("Array after shifting all zero's at end : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}