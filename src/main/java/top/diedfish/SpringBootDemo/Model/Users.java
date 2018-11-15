package top.diedfish.SpringBootDemo.Model;

import java.util.LinkedList;

public  class Users implements IUserData{
    private static LinkedList<User> users;
    private static Users instance = null;
    public static IUserData getInstance() {
        if(instance == null) instance = new Users();
        return  instance;
    }

    private  Users(){
        users = new LinkedList<User>();
    }
    public User[] getUsers() {
        return  (User[])users.toArray(new User[users.size()]);
    }

    public User[] getUsers(String condition) {
        return new User[0];
    }

    public User add(User user) {
        User newUser = user.clone();
        users.add(newUser);
        return newUser;
    }

    public boolean delete(User user) {
        return false;
    }
}
