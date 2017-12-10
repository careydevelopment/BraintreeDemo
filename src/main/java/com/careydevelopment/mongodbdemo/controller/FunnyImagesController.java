package com.careydevelopment.mongodbdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.careydevelopment.mongodbdemo.entity.ChiveImage;
import com.careydevelopment.mongodbdemo.repository.ImageRepository;

@Controller
public class FunnyImagesController {
    
    @Autowired
    ImageRepository imageRepository;
    

    @RequestMapping("/funnyImages")
    public String viewFunnyImages(Model model) {
        //grab the top images
        List<ChiveImage> images = imageRepository.findTop10ByOrderByDateDesc();
                
        //put the list in the model
        model.addAttribute("images",images);
        
        //get out
        return "funnyImages";
    }
    
    
    //redirect to demo if user hits the root
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:funnyImages";
    }
}
