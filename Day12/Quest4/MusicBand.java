package Day12.Quest4;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members = new ArrayList<>();

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

    public void addMember(String memberName, String memberSecondName) {
        if (memberName != null && memberSecondName != null) {
            members.add(memberName + " " + memberSecondName);
        }
    }

    public void deleteMember(String memberName, String memberSecondName) {
        if (memberName != null && memberSecondName != null) {
            members.remove(memberName + " " + memberSecondName);
        }
    }

    public void showMembers() {
        if (members.size() > 0) {
            for (String member : members) {
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
