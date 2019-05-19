package com.satonaka.togglztest.myfeatures;

import org.togglz.core.Feature;
import org.togglz.core.annotation.DefaultActivationStrategy;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {
    @EnabledByDefault
    @Label("Reverse List")
    REVERSE,

    @Label("Shuffle List")
    @DefaultActivationStrategy(id=MyStrategy.ID)
    SHUFFLE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
