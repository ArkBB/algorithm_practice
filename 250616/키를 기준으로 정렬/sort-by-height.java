import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // Please write your code here.

        ArrayList<Student> students = new ArrayList<Student>();

        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] splits = line.split(" ");
            students.add(new Student(splits[0], Integer.valueOf(splits[1]), Integer.valueOf(splits[2])));
        }

        List<Student> sorted = students.stream()
        .sorted(Comparator.comparingInt(a -> a.height))
        .collect(Collectors.toList());

        for(Student a : sorted){
            System.out.println(a.name + " " + a.height + " " + a.weight);
        }

    }

    static class Student {

        String name;
        int height;
        int weight;

        Student (String name, int height, int weight) {
        
            this.name = name;
            this.height = height;
            this.weight = weight;
        
        }

    }

}