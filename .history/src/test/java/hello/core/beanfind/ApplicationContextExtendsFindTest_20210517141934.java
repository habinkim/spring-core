package hello.core.beanfind;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.RateDiscountPolicy;

public class ApplicationContextExtendsFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

    @Configuration
    static class TestConfig {

        @Bean
        public DiscountPolicyu rateDiscountPolicy() {
            return new RateDiscountPolicy();
        }
    }

}
