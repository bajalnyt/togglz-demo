package com.nytimes.togglzdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@RestController
public class MainController {

    private final FeatureManager manager;
    public static final Feature NEW_FEATURE = new NamedFeature("NEW_FEATURE");

    public MainController(FeatureManager manager) {
        this.manager = manager;
    }

    @GetMapping
    public String sayHello(){
        //Set<Feature> s = FeatureContext.getFeatureManager().getFeatures();
        if (manager.isActive(NEW_FEATURE)) {
            return "My awesome new feature!";
        } else {
            return "My original feature";
        }
    }
}
