import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n + 1];
        
        HashMap<String, String> hashmap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            words[i] = sc.next();
            hashmap.put(words[i],String.valueOf(i));
            hashmap.put(String.valueOf(i),words[i]);
        }
        // Please write your code here.
        String[] words2 = new String[m + 1];
        for(int i = 1; i<=m;i++) {
            words2[i] = sc.next();
            System.out.println(hashmap.get(words2[i]));
        }  

    }
}