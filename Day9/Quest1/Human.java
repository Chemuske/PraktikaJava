package Day9.Quest1;

public class Human {

    private String name;

    Human(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    void setname (String name) {
        if (name.length() > 0)
            this.name = name;
    }

    String getName() {
        return name;
    }

    void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

    

}
