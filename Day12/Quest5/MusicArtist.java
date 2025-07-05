package Day12.Quest5;

public class MusicArtist {
    private String name, secondName;
    private int age;

    public MusicArtist (String name, String secondName, int age) {
        if (age > 0 && name != null && secondName != null) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }
    
    public String getSecondName () {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + secondName + " " + age;
    }
}
