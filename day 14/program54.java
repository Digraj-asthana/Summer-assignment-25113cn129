import java.util.*;
class program54
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose frequency is to be checked");
        int key=sc.nextInt();   int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                c++;
            }
        }
        System.out.println("The given numbers frequency is "+c);
    }
}