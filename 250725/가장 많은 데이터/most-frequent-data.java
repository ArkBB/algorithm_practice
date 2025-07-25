import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        HashMap<String, Integer> arr2 = new HashMap<>();

        int max = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            int count = arr2.getOrDefault(arr[i],0);
            arr2.put(arr[i],count+1);
            max = Math.max(max,count+1);
        }
        // Please write your code here.
        System.out.println(max);
    }
}