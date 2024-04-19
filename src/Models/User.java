package Models;

public class User {
    int user_id;
    String user_name;
    Location user_location;

    public User(int user_id, String user_name,Location user_location) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_location=user_location;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Location getUser_location() {
        return user_location;
    }

    public void setUser_location(Location user_location) {
        this.user_location = user_location;
    }
}
