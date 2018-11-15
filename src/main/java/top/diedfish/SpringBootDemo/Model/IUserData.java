package top.diedfish.SpringBootDemo.Model;

public interface IUserData {


    User[] getUsers();
    User[] getUsers(String condition);
    User add(User user);
    boolean delete(User user);


}
