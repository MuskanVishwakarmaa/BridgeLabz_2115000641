import java.util.Scanner;
class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();


        //Check if the number is positive
        if (number<=0){
            System.out.println("Please enter a positive integer.");
            return;
        }


        //Create a String array to store results
        String[] results = new String[number+1];


        //Loop through numbers from 0 to the input number
        for(int i = 0; i <= number; i++){
            if(i%3 == 0 && i%5 == 0){
                results[i] = "FizzBuzz"; // Divisible by both 3 and 5
            } else if(i%3 == 0){
                results[i] = "Fizz"; // Divisible by 3
            } else if(i%5 == 0){
                results[i] = "Buzz"; // Divisible by 5
            } else{
                results[i] = String.valueOf(i); // Not divisible by 3 or 5, save the number
            }
        }


        //Display the results
        for (int i=0; i<=number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
