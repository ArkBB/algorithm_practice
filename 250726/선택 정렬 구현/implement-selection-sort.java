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
        for(int i = 0; i< n-1;i++) {
            int minIndex = i;
            for(int j = i+1; j<n; j++) {
                if(arr[minIndex]>arr[j])
                        minIndex = j;
                    
            }
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }

        for(int i= 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}