import java.util.*;
class program16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        System.out.println("Armstrong numbers in range upto " +range+ " are ");
        for(int i=1;i<=range;i++)
        {
            int count=0,temp,arm=0;
            temp=i;
            while(temp>0)
            {
              temp=temp/10;
                count++;
            }
            temp=i;
            while(temp>0)
            {
              arm= arm+(int)Math.pow(temp%10,count);
              temp=temp/10;
            }
            if(arm==i)
            {
                System.out.println(i);
            }
        }
    }
}