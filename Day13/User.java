package Day13;

import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList <User> subscriptions;
    
    public User(String userName) {
        if (userName != null) {
            this.userName = userName;
            this.subscriptions = new ArrayList<>();
        }
    }

    public String getUserName() {
        return this.userName;
    }

    public ArrayList<User> getSubscriptions() {
        return this.subscriptions;
    }

    public void subscribe(User user) {
        if (user != null) {
            this.subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user) {
        return user != null && this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return user != null 
        && this.subscriptions.contains(user) 
        && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text) {
        //
    }

    public String toString() {
        return this.userName;
    }
}
