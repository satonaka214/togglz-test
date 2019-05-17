package com.satonaka.togglztest.myfeatures;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;

@Configuration
@RequiredArgsConstructor
public class MyFeaturesManagerBean {
    private final MyFeaturesConfiguration configuration;

    @Bean
    FeatureManager featureManager() {
        return new FeatureManagerBuilder()
                .togglzConfig(configuration)
                .build();
    }
}
