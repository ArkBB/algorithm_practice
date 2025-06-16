import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            students.add(new Student(name,score1,score2,score3));

        }
        // Please write your code here.
        List<Student> sortedList = students.stream()
            .sorted(Comparator.comparingInt((Student student) -> student.a+student.b+student.c))
            .collect(Collectors.toList());

        for(Student a : sortedList)
        System.out.println(a.name + " " + a.a + " " + a.b + " " + a.c);

    }

    static class Student {

        String name;
        int a;
        int b;
        int c;

        Student(String name , int a, int b , int c){
            this.name = name;
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }
}