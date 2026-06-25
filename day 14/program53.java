import java.util.*;
class program53
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number to be searched");
        int search  =sc.nextInt();   int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The given number is at "+(i+1)+" position");
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("The given number is not present in the array");
        }
    }
}