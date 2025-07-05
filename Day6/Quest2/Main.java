package Day6.Quest2;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nguyen Van A", "Math");
        Student student = new Student("Nguyen Van B");

        teacher.evaluate(student);
    }
    
}
