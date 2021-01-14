package com.nytimes.togglzdemo.controllers;

import com.nytimes.togglzdemo.features.MyFeatures;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String sayHello(){
        if (MyFeatures.FEATURE_ONE.isActive()) {
            return "My awesome new feature!";
        } else if (MyFeatures.FEATURE_TWO.isActive()) {
            return "My original feature";
        } else {
            return "This operation is not supported at the moment";
        }
    }
}
