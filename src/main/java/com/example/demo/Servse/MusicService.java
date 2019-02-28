package com.example.demo.Servse;

import com.example.demo.dao.MusicDao;
import com.example.demo.entity.Music;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MusicService {
    @Resource
    MusicDao md;

    public List<Music> query(){
        return md.query();
    }
}
