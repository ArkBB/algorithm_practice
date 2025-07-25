import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n + 1];
        
        HashMap<String, Integer> StringToNum = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            words[i] = sc.next();
            StringToNum.put(words[i],i);     
        }
        while(m-- > 0) {
            String key = sc.next();

        
            if('0' <= key.charAt(0) && key.charAt(0) <= '9')
                System.out.println(words[Integer.parseInt(key)]);
            else
                System.out.println(StringToNum.get(key));
        }

    }
}