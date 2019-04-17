import com.baizhi.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class tes {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserService userService;
    @Test
    public  void  All(){
        List<User> users = userDAO.selectAll();
        for (User user:users){
            System.out.println(user);
        }

    }
    @Test
    public  void log(){
        User u = userDAO.login("牛", "123");
        System.out.println(u);

    }
    @Test
    public void serAll(){
        List<User> list = userService.selectAll();
        for (User user:list){
            System.out.println(user);
        }

    }
}
