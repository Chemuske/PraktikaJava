package Day9.Quest1;

public class Student extends Human {

    String group;

    Student(String name, String group) {
        super(name);
        if (group.length() > 0)
            this.group = group;
    }
    
    void setGroup(String group) {
        if (group.length() > 0) {
            this.group = group;
        }
    }

    String getGroup() {
        return group;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
    

}