import java.util.*;
class program50
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum =0,average,k,i;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }
        for(k=0;k<n;k++)
        {
            sum=sum+arr[k];
        }
        average =sum/n;
        System.out.println("The sum of the array is "+sum);
        System.out.println("The average of the array is "+average);
    }
}