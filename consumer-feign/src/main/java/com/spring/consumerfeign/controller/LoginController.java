package com.spring.consumerfeign.controller;

import com.alibaba.fastjson.JSON;
import com.spring.consumerfeign.entity.MenuTree;
import com.spring.consumerfeign.entity.User;
import com.spring.consumerfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){

        return "login";
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submit(String username,String password,Model model,HttpServletRequest request){
        User user =new User();
        user.setName(username);
        user.setEmail(password);
        User user1 = userService.findUser(user);
        List<MenuTree> menuTrees=new ArrayList<>();

        MenuTree menuTree=new MenuTree();
        menuTree.setId(1);
        menuTree.setPid(0);
        menuTree.setName("用户管理");
        menuTrees.add(menuTree);
        MenuTree menuTree2=new MenuTree();
        menuTree2.setId(2);
        menuTree2.setPid(0);
        menuTree2.setName("系统管理");
        menuTrees.add(menuTree2);

//        for(int i=3;i<=5;i++){
//            MenuTree menuTree3=new MenuTree();
//            menuTree3.setId(i);
//            menuTree3.setPid(1);
//            menuTree3.setName("系统管理"+i);
//            menuTrees.add(menuTree2);
//        }

        MenuTree menuTree4=new MenuTree();
        menuTree4.setId(6);
        menuTree4.setPid(2);
        menuTree4.setName("系统配置管理");
        menuTrees.add(menuTree4);

        MenuTree menuTree5=new MenuTree();
        menuTree5.setId(10);
        menuTree5.setPid(2);
        menuTree5.setName("系统日志管理");
        menuTrees.add(menuTree5);

//        for(int i=7;i<=9;i++){
//            MenuTree menuTree6=new MenuTree();
//            menuTree6.setId(i);
//            menuTree6.setPid(6);
//            menuTree6.setName("系统配置管理"+i);
//            menuTrees.add(menuTree2);
//        }

//        for(int i=11;i<=13;i++){
//            MenuTree menuTree7=new MenuTree();
//            menuTree7.setId(i);
//            menuTree7.setPid(10);
//            menuTree7.setName("系统日志管理"+i);
//            menuTrees.add(menuTree2);
//        }
        if(ObjectUtils.isEmpty(user1)){
            return "error";
        }else{
            model.addAttribute("user",user1);
            model.addAttribute("menuss",JSON.toJSONString(menuTrees));
            HttpSession session = request.getSession();
            session.setAttribute("name",username);
            return "welCome";
        }
    }

}
