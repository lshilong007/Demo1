package com.example.demo.Servse;

import com.example.demo.dao.User_infoDao;
import com.example.demo.entity.User_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class User_infoService {
    @Resource
    User_infoDao u;

    public List<User_info> query(){
        return u.query();
    }
    public Integer del(Integer uuid){
        return u.del(uuid);
    }
    public Integer update(User_info uuid){
        return u.upddate(uuid);
    }
    public List<User_info> query1(Integer uuid){
        return u.query1(uuid);
    }

    public String add(){
        return u.add();
    }
}
