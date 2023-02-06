package com.Geekster.urlHitcounter.service;

import com.Geekster.urlHitcounter.model.UrlModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UrlService {
    static int count = 1;
    public UrlModel addEveryCount(){
        UrlModel model = new UrlModel(count++);
        return model;
    }

    static Map<String, Integer> map = new HashMap<>();
    public UrlModel addEveryCountByUsername(String username){
        int count =1;
        if(map.containsKey(username)){
            count = map.get(username);
            map.put(username, ++count);
        }else{
            map.put(username, 1);
        }
//        UrlModel model = new UrlModel(count, username);
//        return model;
        return new UrlModel(count, username);
    }
}
