import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.


        for(int i=0;i<n1;i++){
            if(a[i] == b[0]){
                boolean can = true;

                for(int j=0;j<n2;j++){
                    if(i+j>=n1){
                        can = false;
                        break;
                    }
                    if(a[i+j] != b[j]){
                        can = false;
                        break;
                    }
                }
                if(can == true) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }
}