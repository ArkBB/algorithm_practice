import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        // Please write your code here.
        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
         //   System.out.println(s);
            String[] parse = s.split(" ");
            if(parse[0].equals("add")) {
                int a = Integer.parseInt(parse[1]);
                int b = Integer.parseInt(parse[2]);
              //  sc.nextLine();
                hashMap.put(a,b);
            }
            if(parse[0].equals("find") ){
                int a = Integer.parseInt(parse[1]);
                int result = hashMap.getOrDefault(a,-1);
                if(result == -1)
                System.out.println("None");
                else 
                System.out.println(result);
            }
            if(parse[0].equals("remove")) {
                int a = Integer.parseInt(parse[1]);
                hashMap.remove(a);
            }
        }
    }
}