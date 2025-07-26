import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.
        for(int i = 0; i<n;i++) {
            for(int j = 0; j < n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]+ " ");
        }

        sb.append("\n");

        System.out.println(sb);
    }
}