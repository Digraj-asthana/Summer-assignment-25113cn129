import java.util.*;
class program52
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=sc.nextInt();
        int even=0,odd=0;
        int arr[]= new int[n];
         for(int i=0;i<n;i++)
        {
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else 
            {
                odd++;
            }
        }
        System.out.println("Number of even elements = "+even);
        System.out.println("Number of odd elements = "+odd);
   }
}