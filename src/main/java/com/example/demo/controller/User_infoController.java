package com.example.demo.controller;

import com.example.demo.Servse.User_infoService;
import com.example.demo.entity.User_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("users")
public class User_infoController {
    @Autowired
    User_infoService us;

    @RequestMapping("query")
    public String query1(Model model){
        List<User_info> list = us.query();
        model.addAttribute("list",list);
        return  "index";
    }
    @RequestMapping("del")
    @ResponseBody
    public String del(Integer uuid){
        us.del(uuid);
        return "1";
    }
    @RequestMapping("update")
    public String update(User_info uuid){
        us.update(uuid);
        return "redirect:query";
    }
    @RequestMapping("query1")
    public String query1(Integer uuid,Model model){
        List<User_info> query=us.query1(uuid);
        model.addAttribute("q",query);
        return "update";
    }

    @RequestMapping("add")
    public String add(){
        us.add();
        return "index";
    }
}
