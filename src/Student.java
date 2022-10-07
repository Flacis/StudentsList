import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || !obj.getClass().equals(Student.class))
            return false;
        Student altStudent = (Student) obj;
        //System.out.println("Уже есть такой номер студенческого билета " + this.studentId);
        return studentId.equals(altStudent.studentId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return String.format("- %s, группа %s, номер студенческого билета: %s", name, group, studentId);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }
}
