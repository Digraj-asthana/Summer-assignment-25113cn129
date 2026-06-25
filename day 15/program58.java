import java.util.*;
class program58
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
            System.out.println("It is single element array cannot rotate ");
            return;
        }
        int firstEle = arr[0];
        for (int i = 0; i <n-1; i++)
         {
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstEle;

        // printing
        System.out.println("Array after left rotation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}