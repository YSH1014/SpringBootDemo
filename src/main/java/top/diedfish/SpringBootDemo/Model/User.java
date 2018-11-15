package top.diedfish.SpringBootDemo.Model;

import org.springframework.stereotype.Component;

@Component
public class User implements Cloneable{
    String name;
   // Group group;
    int grade;

    public User(String name,  int grade) {
        this.name = name;
      //  this.group = group;
        this.grade = grade;
    }
    public  User(){
        name="default";
        grade = 0;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public  User clone(){
        User user = new User();
        user.name = this.name;
        user.grade = this.grade;
        return user;
    }
}
