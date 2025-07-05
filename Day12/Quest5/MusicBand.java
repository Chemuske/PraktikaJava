package Day12.Quest5;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void addMember(MusicArtist member) {
        if (member != null) {
            members.add(member);
        }
    }

    public void deleteMember(MusicArtist member) {
        if (member != null) {
            members.remove(member);
        }
    }

    public void showMembers() {
        if (members.size() > 0) {
            for (MusicArtist member : members) {
                System.out.print(member + "\t");
            }
        }
    }

    static public void transferMembers(MusicBand fromBand, MusicBand toBand) {
        if (fromBand != null && fromBand.members != null && toBand != null) {
                toBand.members.addAll(fromBand.members);
                fromBand.members.removeAll(fromBand.members);
            }
        }
}
