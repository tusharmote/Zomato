package Controller;

import Models.User;

import java.util.HashMap;

public class UserManager {
    HashMap<String, User> userHashMap=new HashMap<>();
    private UserManager(){

    }
    private static UserManager instance=null;
    public static UserManager getInstance(){
        if(instance==null){
            synchronized (Class.class){
                if(instance==null){
                    instance=new UserManager();
                    return instance;
                }
            }
        }
        return instance;
    }
    public void addUser(User user){
        userHashMap.put(user.getUser_name(),user);
    }

    public HashMap<String, User> getUserHashMap() {
        return userHashMap;
    }
}
