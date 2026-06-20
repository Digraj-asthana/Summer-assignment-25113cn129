import java.util.*;
class program49
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }
        System.out.print("The elements in array are ");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}