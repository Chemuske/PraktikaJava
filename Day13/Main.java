package Day13;

public class Main {
    public static void main(String[] args) {
        
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        
        MessageDatabase.sendMessage(user1, user2, "Hello");
        MessageDatabase.sendMessage(user1, user2, "I am user1");

        MessageDatabase.sendMessage(user2, user1, "Hello");
        MessageDatabase.sendMessage(user2, user1, "I am user2");
        MessageDatabase.sendMessage(user2, user1, "How are you?");

        MessageDatabase.sendMessage(user3, user1, "SPAM1");
        MessageDatabase.sendMessage(user3, user1, "SPAM2");
        MessageDatabase.sendMessage(user3, user1, "SPAM3");
        
        MessageDatabase.sendMessage(user1, user3, "SPAM4");
        MessageDatabase.sendMessage(user1, user3, "SPAM5");
        MessageDatabase.sendMessage(user1, user3, "SPAM6");
        
        MessageDatabase.sendMessage(user3, user1, "SPAM!!!!!!!");

        //System.out.println(MessageDatabase.getMessages());

        MessageDatabase.showDialog(user1, user3);
    }
    
}
