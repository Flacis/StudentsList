import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        inputData(students);

        printAllStudent(students);

    }

    private static void inputData(Set<Student> students) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
                System.out.println("(для завершения работы программы введите \"end\")");
                final String userInput = scanner.nextLine();
                if ("end".equals(userInput)) break;
                final Student student = parseContact(userInput);
                if (!students.add(student)) {
                    System.out.println("Уже есть такой номер студенческого билета " + student.getStudentId());
                }
                students.add(student);
            }
        }
    }


    private static void printAllStudent(Set<Student> students) {
        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static Student parseContact(String userInput) {
        final String[] studentData = userInput.split(",\\s+");
        return new Student(studentData[0], studentData[1], studentData[2]);

    }
}