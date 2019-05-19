package com.satonaka.togglztest.myfeatures;

import lombok.val;
import org.togglz.core.activation.Parameter;
import org.togglz.core.repository.FeatureState;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.FeatureUser;

import java.util.Calendar;

public class MyStrategy implements ActivationStrategy {
    public static final String ID = "MyStrategy";

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public String getName() {
        return "Custom Strategy";
    }

    @Override
    public boolean isActive(FeatureState featureState, FeatureUser user) {
        val second = Calendar.getInstance().get(Calendar.SECOND);

        return second < 30;
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[0];
    }
}
