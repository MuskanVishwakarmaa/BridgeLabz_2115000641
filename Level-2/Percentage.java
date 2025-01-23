import java.util.Scanner;
public class Percentage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter physics marks: ");
		double physics = sc.nextDouble();
		System.out.print("Enter chemistry marks: ");
		double chemistry = sc.nextDouble();
		System.out.print("Enter maths marks: ");
		double maths = sc.nextDouble();
		double percent = (((physics + chemistry + maths)/300)*100);
		if (percent>=80){
			System.out.println("Average marks " + percent + "%" + "\nGrade A \nRemarks: Level4, above agency-normalized standards");
		}
		else if(percent>=70 && percent<=79){
			System.out.println("Average marks " + percent + "%" + "\nGrade B \nRemarks: Level3, at agency-normalized standards");
		}
		else if(percent>=60 && percent<=69){
			System.out.println("Average marks " + percent + "%" + "\nGrade C \nRemarks: Level2, below, but approaching agency-normalized standards");
		}
		else if(percent>=50 && percent<=59){
			System.out.println("Average marks " + percent + "%" + "\nGrade D \nRemarks: Level1, well below agency-normalized standards");
		}
		else if(percent>=40 && percent<=49){
			System.out.println("Average marks " + percent + "%" + "\nGrade E \nRemarks: Level 1-, too below agency-normalized standards");
		}
		else{
			System.out.println("Average marks " + percent + "%" + "\nGrade R \nRemarks: Remedial standards");
		}
		sc.close();
	}
}
