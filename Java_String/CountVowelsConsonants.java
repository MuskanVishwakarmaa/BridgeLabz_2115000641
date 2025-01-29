import java.util.Scanner;
public class CountVowelsConsonants{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int Ccount = 0;
		int Vcount = 0;
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				Vcount++;
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
				Ccount++;
			}
		}
		System.out.println("Total number of Vowels are " + Vcount);
		System.out.println("Total number of Consonants are " + Ccount);
	}
}
