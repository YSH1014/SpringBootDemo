package top.diedfish.SpringBootDemo.Data;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import top.diedfish.SpringBootDemo.Model.User;

import javax.validation.constraints.Null;
import java.util.LinkedList;
@Aspect
@Component
public class UserSet {
    LinkedList<User> users;
    @AneedCheck
    public int getCount() throws NullPointerException{
      //  if(users == null) throw  new NullPointerException("user list has not initialized");
        return users.size();
    }
    @AneedCheck
    public User Add(User u) throws NullPointerException{
       // if( users == null) throw new NullPointerException("user list has not initialized");
        users.add(u);
        return u;
    }

    @Pointcut("@annotation(top.diedfish.SpringBootDemo.Data.AneedCheck)")
    public  void pointCut(){};
    @Before("pointCut()")
    private boolean checkNull(JoinPoint joinPoint) throws NullPointerException {
        if(users == null) throw new NullPointerException("user list has not initialized");
        return  users == null;
    }


    public UserSet(){
        this.users = new LinkedList<User>();
    }
}
