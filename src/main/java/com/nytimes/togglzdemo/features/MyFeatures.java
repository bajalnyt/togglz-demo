package com.nytimes.togglzdemo.features;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {

    @Label("First Feature")
    @EnabledByDefault
    FEATURE_ONE,

    @Label("Second Feature")
    FEATURE_TWO;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}