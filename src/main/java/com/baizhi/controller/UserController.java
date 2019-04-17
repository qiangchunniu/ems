package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ems")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String log(String name, String password){
        User login = userService.login(name, password);
        if (login!=null){
            if (login.getStatr().equals("1")){
                    return "redirect:/ems/showAll";
            }else{

                return "redirect:/login.jsp";
            }

        }else{
            return "redirect:/login.jsp";
        }

    }
    @RequestMapping("showAll")
    public String showAll(HttpServletRequest request){
        List<User> users = userService.selectAll();
        request.setAttribute("list",users);
        return "forward:/emplist.jsp";
    }
    @RequestMapping("delete")
    public String delete(Integer id){
        userService.delete(id);
        return "redirect:/ems/showAll";
    }

    @RequestMapping("update")
    public  String update(User user){
        userService.update(user);
        return "redirect:/ems/showAll";
    }
    @RequestMapping("add")
    public  String add(User user){
        userService.add(user);
        return "redirect:/ems/showAll";
    }
}
