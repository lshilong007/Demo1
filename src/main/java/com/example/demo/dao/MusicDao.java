package com.example.demo.dao;

import com.example.demo.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MusicDao {

    @Select("select * from music")
    public List<Music> query();
}
