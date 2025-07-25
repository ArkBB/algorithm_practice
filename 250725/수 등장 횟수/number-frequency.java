import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer,Integer> countMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int ie = countMap.getOrDefault(arr[i],0);
            
            countMap.put(arr[i],ie+1);
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
            if(countMap.get(queries[i]) != null)
            System.out.print(countMap.get(queries[i])+ " ");
            else
            System.out.print(0 + " ");
        }

    }
}