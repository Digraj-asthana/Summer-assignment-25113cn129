import java.util.*;
class program68 {
     public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        LinkedHashSet<Integer> commonEle = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array 1 and array 2");
        int length1 = sc.nextInt(), length2 = sc.nextInt();

        if (length1 < 1 || length2 < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }
        System.out.println("Enter integer element of array 1 ");
        for (int i = 0; i < length1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Enter integer element of array 2 ");
        for (int i = 0; i < length2; i++) {
            int input = sc.nextInt();
            if (set1.contains(input)) {
                commonEle.add(input);
            }
        }

        System.out.println("The common elements are ");
        for (Integer ele : commonEle) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}