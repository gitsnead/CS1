
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        // Input list of students.
        Scanner reader = new Scanner(System.in);
        String studentName;
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("student number: ");
            students.add(new Student(studentName, reader.nextLine()));
        }
        // Print the student list.
        for(Student student : students) {
            System.out.println(student.toString());
        }
        
        //String match on student names and print the results.
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for(Student doesStudent : students) {
            if (doesStudent.getName().contains(searchTerm)) {
                System.out.println(doesStudent.toString());
            }
        }
    }
}
