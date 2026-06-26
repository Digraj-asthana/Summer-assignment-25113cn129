 import java.util.*;
 class program62{
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        if (length < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        int[] arr = new int[length];

        // inputing array
        System.out.println("Enter integer element of array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxFreqEle = arr[0];
        for (int i = 0; i < length; i++) {
            int freq = 1;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                maxFreqEle = arr[i];
            }
        }

        if (maxFreq == 1) {
            System.out.println("There is no dulpicate elements ");
        } else {
            System.out.println("The maximum frequency element is " + maxFreqEle);
        }

        sc.close();
    }
}