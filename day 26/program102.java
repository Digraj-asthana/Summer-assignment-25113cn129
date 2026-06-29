import java.util.*;
class Voter {
    private int age;
    public Voter(int age) {
        this.age = age;
    }

    public boolean isEligible() {
        return (age >= 18);
    }
}
class program102 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        Voter voter = new Voter(sc.nextInt());
        
        if (voter.isEligible()) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        sc.close();
    }
}