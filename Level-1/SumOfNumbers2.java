import java.util.Scanner;
public class SumOfNumbers2{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                double total = 0.0;
                while(true){
                        System.out.print("Enter another number (0 to stop): ");
                        double number = sc.nextDouble();
			if(number<=0){
				break;
                	}
			total+=number;
                }
		System.out.println("The total sum is: " + total);
                sc.close();
        }
}

