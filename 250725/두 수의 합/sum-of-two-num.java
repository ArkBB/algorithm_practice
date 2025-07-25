import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            Integer a = sumMap.getOrDefault(Integer.valueOf(k-arr[i]),0);
            count += a;
            sumMap.put(arr[i],sumMap.getOrDefault(Integer.valueOf(arr[i]),0)+1);
        }
        // Please write your code here.
        System.out.println(count);
    }
}