import java.util.Scanner;
public class SumOfNaturalNumber2{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a natural number: ");
                int n = sc.nextInt();
                if(n<=0){
                        System.out.println("Please enter a positive natural number");
                }
                else{
                        int formulaSum = n*(n+1)/2;
                        int loopSum=0;
                        for(int i=1; i<=n; i++){
                                loopSum+=i;
                        }
                        System.out.println("Sum of using formula " + formulaSum);
                        System.out.println("Sum of using while loop " + formulaSum);
                        if(formulaSum == loopSum){
                                System.out.println("Both result are same");
                        }
                        else{
                                System.out.println("Both result are different");
                        }
                }
                sc.close();
        }
}
