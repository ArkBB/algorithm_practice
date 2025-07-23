import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            if(upperBound(x,arr)-lowerBound(x,arr)<=0)
            System.out.println(0);
            else
            System.out.println(upperBound(x,arr)-lowerBound(x,arr));
        }
    }

    static int lowerBound(int target, int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;
        int minidx = arr.length;

        while(left<=right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= target){
                minidx=Math.min(minidx,mid);
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return minidx;
    }

    static int upperBound(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int minidx = arr.length;

        while(left<=right) {
            int mid = (left + right) / 2;
            if(arr[mid] > target){
                minidx=Math.min(minidx,mid);
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
            return minidx;

    }
}