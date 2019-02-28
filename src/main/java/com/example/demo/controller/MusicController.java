package com.example.demo.controller;

import com.example.demo.Servse.MusicService;
import com.example.demo.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    MusicService ms;

    @RequestMapping("query")
    public String query(Model model){
        List<Music> list =ms.query();
        model.addAttribute("list",list);
        return "music";
    }
}
