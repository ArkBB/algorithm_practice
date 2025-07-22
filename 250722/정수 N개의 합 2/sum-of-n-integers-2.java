import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n+1];
        sum[0] = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i!=0)
            sum[i+1] = sum[i]+arr[i];
            else{
                sum[i+1]=arr[i];
            }
        }
        // Please write your code here.
        
        int max = -1000;
        for(int i=k;i<=n;i++){
            max = Math.max(max,sum[i]-sum[i-k]);
        }

        System.out.println(max);
    }
}