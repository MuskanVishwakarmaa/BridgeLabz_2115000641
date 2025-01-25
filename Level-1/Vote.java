import java.util.Scanner;
class Vote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of ten students        

        // Taking input for student ages
        for(int i=0; i<ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
		
        // Checking students voting eligibility
        for(int age=0; age<ages.length; age++){
            if(ages[age] < 0){
                System.out.println("Invalid age : " + ages[age]);
            } else if(ages[age] >= 18){
                System.out.println("The student with age " + ages[age] + " can vote.");
            } else{
                System.out.println("The student with age " + ages[age] + " cannot vote.");
            }
        }
    }
}
