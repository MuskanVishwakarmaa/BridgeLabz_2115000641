import  java.util.Scanner;
public class Chocolates{
	public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren){
		int chocolates = numberOfChocolates/numberOfChildren;
		int remainingChocolates = numberOfChocolates%numberOfChildren;
		return new int[]{chocolates, remainingChocolates};
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of Chocolates: ");
		int numberOfChocolates = sc.nextInt();
		System.out.print("Enter total number of Children: ");
                int numberOfChildren = sc.nextInt();
		int result[] = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
		int chocolates = result[0];
		int remainingChocolates = result[1];
		System.out.println("Each children get " + chocolates + " chocolates and number of remaining chocolates are " + remainingChocolates);
	}
}
