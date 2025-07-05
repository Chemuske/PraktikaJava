package Day9.Quest1;

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("John", "Computer Science");
        Teacher teacher1 = new Teacher("Mary", "Math");

        System.out.println(student1.getGroup());
        System.out.println(teacher1.getObject());

        student1.printInfo();
        teacher1.printInfo();
    }
    
}
