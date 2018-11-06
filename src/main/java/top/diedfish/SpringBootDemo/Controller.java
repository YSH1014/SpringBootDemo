package top.diedfish.SpringBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@RestController
public class Controller {
    @RequestMapping("/")
    String index(){
        return "hello,index";
    }

    @RequestMapping("/hello")
    void world(HttpServletRequest request,HttpServletResponse response){
        try {
            String name = request.getParameter("name");
            OutputStream out = response.getOutputStream();
            ((ServletOutputStream) out).println("hello," + name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
