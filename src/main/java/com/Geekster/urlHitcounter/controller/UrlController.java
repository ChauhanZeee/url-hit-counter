package com.Geekster.urlHitcounter.controller;

import com.Geekster.urlHitcounter.model.UrlModel;
import com.Geekster.urlHitcounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlController {

@Autowired
private UrlService urlService;

@GetMapping("/count")
    public UrlModel addEveryCount(){
    return urlService.addEveryCount();
    }

    @GetMapping("/username/{username}/count")
    public UrlModel addEveryCountByUsername(@PathVariable String username){
        return urlService.addEveryCountByUsername(username);
    }
}
