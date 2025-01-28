import java.util.Scanner;
public class VoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];
        VoteChecker checker = new VoteChecker();
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            boolean canVote = checker.canStudentVote(age);
            if (age < 0) {
                System.out.println("Student " + (i + 1) + ": Age is invalid (negative). Cannot vote.");
            } else {
                System.out.println("Student " + (i + 1) + ": " +
                        (canVote ? "Eligible to vote." : "Not eligible to vote."));
            }
        }
        sc.close();
    }
}
