package Day12.Quest5;

public class Main {
    public static void main(String[] args) {
        
        MusicBand band1 = new MusicBand("Fband", 1999);
        MusicBand band2 = new MusicBand("Sband", 1999);

        MusicArtist artist1 = new MusicArtist("Ivan", "Ivanov", 1999);
        MusicArtist artist2 = new MusicArtist("Petr", "Petrov", 1998);
        MusicArtist artist3 = new MusicArtist("Vlad", "Vladov", 1997);

        band1.addMember(artist1);
        band1.addMember(artist2);
        band2.addMember(artist3);

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
