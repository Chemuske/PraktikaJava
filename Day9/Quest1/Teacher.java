package Day9.Quest1;

public class Teacher extends Human  {
    
    String object;

    Teacher(String name, String object) {
        super(name);
        if (object != null) {
            this.object = object;
        }
    }

    void setObject(String object) {
        if (object != null) {
            this.object = object;
        }
    }

    String getObject() {
        return object;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
 
    }

}
