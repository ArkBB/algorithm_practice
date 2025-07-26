import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i = n-1; i>= 0;i--) {
            int max = -1;
            int idx = -1;
            for(int j = 0; j<=i; j++) {
                if(max<arr[j])
                    {
                        max = arr[j];
                        idx = j;
                    }

            }
            if(max != -1) {
            int temp = arr[i];
            arr[i] = max;
            arr[idx] = temp;
            }

        }

        for(int i= 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}