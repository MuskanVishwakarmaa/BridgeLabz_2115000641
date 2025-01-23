import java.util.Scanner;
public class FactorialNumber2{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a positive number: ");
                int num = sc.nextInt();
                if(num<0){
                        System.out.println("Please enter a positive number");
                }
                else{
                        long factorial = 1;
                        for(int i=1; i<=num; i++){
                                factorial *= i;
                        }
                        System.out.println("The factorial of " + num + " is: " + factorial);
                }
                sc.close();
        }
}
