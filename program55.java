import java.util.*;
class program55
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int secLargest=Integer.MIN_VALUE;
        System.out.println("Enter all the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        for (int i = 0; i < n; i++)
         {
            if (arr[i] > secLargest && arr[i] != largest) 
            {
                secLargest = arr[i];
            }
        }
        System.out.println("The second largest value is "+secLargest);
    }
}