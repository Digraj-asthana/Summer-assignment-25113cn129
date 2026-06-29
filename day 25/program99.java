import java.util.*;
class program99 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names");
        String[] names = new String[sc.nextInt()];
        sc.nextLine();

        System.out.println("Enter the list of names");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);
        System.out.print("Sorted names alphabetically are ");
        System.out.println(Arrays.toString(names));

        sc.close();
    }
}