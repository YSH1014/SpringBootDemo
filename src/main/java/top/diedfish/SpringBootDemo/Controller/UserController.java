package top.diedfish.SpringBootDemo.Controller;

import org.junit.runners.Parameterized;
import org.springframework.web.bind.annotation.*;
import top.diedfish.SpringBootDemo.Model.User;
import top.diedfish.SpringBootDemo.Model.Users;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public User[] getUsers(){
        return Users.getInstance().getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public  User addUser(@ModelAttribute User user){

        return  Users.getInstance().add(user);
    }


    @RequestMapping(method = RequestMethod.GET ,value = "/default")
    public User defultUser(){
        return  new User("heheheh",1);
    }
}
