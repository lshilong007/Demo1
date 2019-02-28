package com.example.demo.dao;

import com.example.demo.entity.User_info;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface User_infoDao {

    @Select("select * from user_info")
    public List<User_info> query();

    @Delete("delete from user_info where uuid=#{uuid}")
    public Integer del(Integer uuid);

    @Update("update user_info set uname=#{uname},pwd=#{pwd} where uuid=#{uuid}")
    public Integer upddate(User_info uuid);

    @Select("select * from user_info where uuid=#{uuid}")
    public List<User_info> query1(Integer uuid);

    @Insert("insert into user_info(uname,pwd) values('${uname}','${pwd}')")
    public String add();
}
