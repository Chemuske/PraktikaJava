package Day6.Quest2;

public class Teacher {

    private String name, subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student){
        String score = "";
        switch ((int) (Math.random() * 4 + 2)) {
            case 2:
                score = "Неудовлетворительно";
                break;
    
            case 3:
                score = "Удовлетворительно";
                break;
            
            case 4:
                score = "Хорошо";
                break;
            
            case 5:
                score = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента " + student.getName() + " по предмету " + subject + " на оценку " + score);
    }

}
