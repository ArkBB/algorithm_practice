import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<ExamResult> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            results.add(new ExamResult(name, korean, english, math));
        }

        List<ExamResult> sortedResult = results.stream()
            .sorted(
                Comparator.comparingInt((ExamResult a) -> a.korean).reversed()
              .thenComparing(Comparator.comparingInt((ExamResult a) -> a.english).reversed())
              .thenComparing(Comparator.comparingInt((ExamResult a) -> a.math).reversed())
            )

            .collect(Collectors.toList());

        for (ExamResult a : sortedResult) {
            System.out.println(a.name + " " + a.korean + " " + a.english + " " + a.math);
        }
    }

    static class ExamResult {
        String name;
        int korean;
        int english;
        int math;

        ExamResult(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
