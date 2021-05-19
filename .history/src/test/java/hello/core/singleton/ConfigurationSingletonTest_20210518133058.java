package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest() {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
    
}
