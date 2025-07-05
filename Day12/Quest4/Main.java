package Day12.Quest4;

public class Main {
    public static void main(String[] args) {
        
        MusicBand band1 = new MusicBand("Fband", 1999);
        MusicBand band2 = new MusicBand("Sband", 1999);

        band1.addMember("Ivan", "Ivanov");
        band1.addMember("Petr", "Petrov");
        band2.addMember("Vlad", "Vladov");

        System.out.print("\n Band1: ");
        band1.showMembers();
        System.out.print("\n Band2: ");
        band2.showMembers();

        MusicBand.transferMembers(band1, band2);

        System.out.println();
        System.out.print("\n Band1: ");
        band1.showMembers();
        System.out.print("\n Band2: ");
        band2.showMembers();

    }
}
