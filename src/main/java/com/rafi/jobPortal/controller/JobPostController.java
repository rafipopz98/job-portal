package com.rafi.jobPortal.controller;

import com.rafi.jobPortal.MongoRepo;
import com.rafi.jobPortal.models.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    MongoRepo repo;
    @RequestMapping(value = "/")
    public String hello(){
        return " hello World ";
    }

    @RequestMapping(value = "/alljobs")
    public List<PostModel> getAllPost(){
        return repo.findAll();
    }

    @PostMapping(value = "/addNew")
    public PostModel addPost(@RequestBody PostModel postModel){
       return repo.save(postModel);
    }

}
