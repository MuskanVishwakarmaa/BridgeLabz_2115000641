import java.util.Scanner;
public class RemoveDuplicates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String result = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			boolean isDuplicate = false;
			for(int j=0; j<result.length(); j++){
				if(result.charAt(j) == ch){
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate){
				result += ch;
			}
		}
		System.out.println("Original String: " + str);
	        System.out.println("String after removing duplicates: " + result);
        	sc.close();
    	}
}
