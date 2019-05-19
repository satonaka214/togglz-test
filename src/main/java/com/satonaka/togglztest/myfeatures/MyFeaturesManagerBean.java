package com.satonaka.togglztest.myfeatures;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.context.StaticFeatureManagerProvider;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;

@Configuration
@RequiredArgsConstructor
public class MyFeaturesManagerBean {
    private final MyFeaturesConfiguration configuration;

    @Bean("FeatureManager")
    FeatureManager featureManager() {
        val manager = new FeatureManagerBuilder()
                .togglzConfig(configuration)
                .activationStrategy(new MyStrategy())
                .build();
        StaticFeatureManagerProvider.setFeatureManager(manager);

        return manager;
    }

}
