package com.launchcode.clexahostingproject.controller;

import java.util.List;

import com.launchcode.clexahostingproject.entity.Story;
import com.launchcode.clexahostingproject.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoryController {

    @Autowired
    private StoryRepository sRepo;

    @GetMapping("/showStories")
    public ModelAndView showStories(){
        ModelAndView mav = new ModelAndView("list-stories");
        List<Story> list = sRepo.findAll();
        mav.addObject("stories", list);
        return mav;
    }
}
