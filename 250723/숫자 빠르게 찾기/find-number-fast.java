import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            System.out.println(binarySearch(x,arr));
        }

    }

    static int binarySearch(int a, int[] arr){

        int left = 0;
        int right = arr.length - 1;
        
        while(left<=right) {
            int mid = (left + right) / 2;
            if(arr[mid] == a) {
                return mid+1;
            }
            if(arr[mid] < a) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return -1;
    }
}