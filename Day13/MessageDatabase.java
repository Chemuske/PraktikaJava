package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static ArrayList<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        if (u1 != null && u2 != null) {
            messages.add(new Message(u1, u2, text));
        }
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        if (u1 != null && u2 != null) {
            for (Message m : messages) {
                if (m.getSender().equals(u1) && m.getReceiver().equals(u2)) {
                    System.out.println(u1.getUserName() + ": " + m.getText());
                }
                if (m.getSender().equals(u2) && m.getReceiver().equals(u1)) {
                    System.out.println(u2.getUserName() + ": " + m.getText());
                }
            }
        }
    }

}
