package com.satonaka.togglztest.myfeatures;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.servlet.user.ServletUserProvider;

import java.io.File;

@Component
@Getter
public class MyFeaturesManager {
    private final FeatureManager manager;

    public MyFeaturesManager() {
        this.manager = new FeatureManagerBuilder()
                .featureEnum(MyFeatures.class)
                .stateRepository(new FileBasedStateRepository(new File("tmp/features.properties")))
                .userProvider(new ServletUserProvider("Admin"))
                .build();
    }
}
