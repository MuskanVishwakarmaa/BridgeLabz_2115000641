import java.util.Scanner;
public class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--){
			char ch = str.charAt(i);
			revStr+=ch;
		}
		System.out.println("Reverse String is " + revStr);
	}
}
