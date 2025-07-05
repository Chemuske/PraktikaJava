package Day13;

import java.sql.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    
    public Message(User sender, User receiver, String text) {
        if (sender != null && receiver != null && !text.isEmpty()) {
            this.sender = sender;
            this.receiver = receiver;
            this.text = text;
            this.date = new Date(System.currentTimeMillis());
        }
    }

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }

    public String toString() {
        return "\n----------" +
        "\nFrom: " + sender.getUserName() + 
        "\nTo: " + receiver.getUserName() + 
        "\nOn: " + date + 
        "\nText: " + text;
    }

}
