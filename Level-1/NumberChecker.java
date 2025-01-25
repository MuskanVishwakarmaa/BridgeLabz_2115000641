import java.util.Scanner;
class NumberChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers


        // Taking input for array
        for(int i=0; i<numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }


        // Checking each number
        for(int num=0; num>numbers.length; num++) {
            if(numbers[num]>0){
                if(numbers[num]%2 == 0){
                    System.out.println("The number " + numbers[num] + " is positive and even.");
                } else{
                    System.out.println("The number " + numbers[num] + " is positive and odd.");
                }
            } else if(numbers[num]<0){
                System.out.println("The number " + numbers[num] + " is negative.");
            } else{
                System.out.println("The number is zero.");
            }
        }


        // Comparing first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length-1];


        if(first == last){
            System.out.println("The first and last numbers are equal.");
        } else if(first > last) {
            System.out.println("The first number is greater than the last number.");
        } else{
            System.out.println("The first number is less than the last number.");
        }
    }
}
