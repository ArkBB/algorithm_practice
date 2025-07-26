import java.util.Scanner;
import java.util.*;
import java.util.stream.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i],max);
        }
        // Please write your code here
        int maxDigits = Integer.toString(max).length();

        ArrayList<LinkedList<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i<10;i++) {
            buckets.add(new LinkedList<>());
        }

        List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());


        int divisor = 1;
        for(int d= 0; d< maxDigits; d++) {
            for (Integer num : numList) {
                Integer digit = (num/divisor) %10;
                buckets.get(digit).add(num);
            }
       

        numList.clear();
        for(LinkedList<Integer> bucket: buckets) {
            while (!bucket.isEmpty()) {
                numList.add(bucket.poll());
            } 
        }
        divisor *= 10;
        }
        for(int num : numList) {
            System.out.print(num + " ");
        }
    }
}