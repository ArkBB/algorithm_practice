import java.util.Scanner;
public class Main {

    static int n = 0;
    static StringBuilder sb;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        visited = new boolean[n+1];
        int[] sequence = new int[n+1];

        sb = new StringBuilder();

        dfs(1,sequence);

        System.out.println(sb);
    }

    static void dfs(int dept,int[] sequence) {

        if(dept == n+1) {
            for(int i =1; i<=n; i++) {
                sb.append(sequence[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i= 1;i<=n; i++){
            if(!visited[i]) {
            sequence[dept] = i;
            visited[i] = true;
            dfs(dept+1,sequence);
            visited[i] = false;
        }

    }
}
}