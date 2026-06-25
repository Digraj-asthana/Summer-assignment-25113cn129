import java.util.*;
class program47
{
    public static void fabonacci(int ...arr)
    {
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];  
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int n=sc.nextInt();
        int arr[]=new int[n];
         fabonacci(arr);
         System.out.println("The fabonacci series is");
          System.out.print(arr[0]+" "+arr[1]+" ");
          for(int i=2;i<arr.length;i++)
          {
             System.out.print(arr[i]+" ");
          }
    }
}