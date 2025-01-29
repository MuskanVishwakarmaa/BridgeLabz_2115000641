import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of guess: ");
		int k = sc.nextInt();
		Random random = new Random();
		int num = random.nextInt(100) +1;
		for(int i=0; i<k; i++){
			System.out.print("Guess the number between 1-100 within " + k + " trials: ");
			int guess = sc.nextInt();
			if(guess > num){
				System.out.println("Your Guess too is high");
			}
			else if(guess< num){
				System.out.println("Your Guess is too low");
			}
			else{
				System.out.println("Congratulations! you guess the correct number");
				break;
			}
			if(i == k-1){
				System.out.println("Sorry! You've used all your attempts. The correct number was: " + num);
            		}
		}
		sc.close();
	}
}
