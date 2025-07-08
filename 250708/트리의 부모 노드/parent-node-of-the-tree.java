import java.util.Scanner;
import java.util.*;

public class Main {

    public static final int MAX_N = 100000;

    public static int n;
    public static ArrayList<Integer>[] edges = new ArrayList[MAX_N + 1];
    public static boolean[] visited = new boolean[MAX_N +1];
    public static int[] parent = new int[MAX_N + 1];

    // 트리 순회를 진행한다.
    // DFS 방식으로 진행하며,
    // 진행되는 간선에 대해 (부모, 자식) 관계를 정해준다.

    public static void traversal(int x) {
            //노드 x에 연결된 간선을 살펴본다.
            for(int i = 0; i < edges[x].size(); i++){
                int y = edges[x].get(i);
                // 아직 방문해본적이 없는 노드라면
                // 트리의 부모-자식 관계가 결정된다.
                // 부모는 x , 자식이 y가 된다.
                if(!visited[y]) {
                    visited[y] = true;
                    parent[y] = x;

                    // 추가적으로 탐색을 더 진행한다.
                    traversal(y);
                }
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 1; i<= n; i++)
            edges[i] = new ArrayList<>();

        // n - 1개의 간선 정보를 입력받는다.
        for(int i = 1; i<= n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            edges[x].add(y);
            edges[y].add(x);
        }

        visited[1] = true;
        traversal(1);

        for(int i = 2; i<= n; i++)
            System.out.println(parent[i]);

        
    
    }
}