import java.util.Scanner;
public class StudentFeeDiscount{
        public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fee: ");
                int fee = sc.nextInt();
		System.out.println("Enter the Discount Percent: ");
                int discountPercent = sc.nextInt();
                int discount = (fee*discountPercent)/100;
                int discountedFee = fee-discount;
                System.out.println("The discount amount is INR " + discount + "% and final discounted fee is INR " + discountedFee);
        }
}
