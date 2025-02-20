import java.util.*;
public class FrequencyElements{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       String[] a = new String[n];
       for (int i = 0; i < n; i++) {
           a[i] = input.next();
       }
       ArrayList<String> ll = new ArrayList<>();
       for (String i : a) {
           ll.add(i);
       }


       HashMap<String, Integer> map= new HashMap<>();
       for(int i=0;i<ll.size();i++){
           if(map.containsKey(ll.get(i))){
               map.put(a[i], map.get(a[i])+1);
           }
           else{
               map.put(a[i],1);
           }
       }
       System.out.println(map);
   }
}
