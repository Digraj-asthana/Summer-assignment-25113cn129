import java.util.*;
class program51
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }
        int smallest =arr[0];
        int largest =arr[0];
        for(int i=1;i<n;i++)
        {
            if(smallest> arr[i])
            {
                smallest= arr[i];
            }
            if(largest< arr[i])
            {
                largest= arr[i];
            }
        }
        System.out.println("The largest element is "+largest);
        System.out.println("The smallest element is "+smallest);
    }
}