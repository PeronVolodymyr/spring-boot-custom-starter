package com.example.springbootcustomstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 The @ConditionalOnClass annotation lets SampleService classes be included based on the presence of SampleService class in ApplicationContext.
 The @ConditionalOnMissingBean annotation indicates the sampleService bean is going to be created if no bean of type SampleService is already contained in the ApplicationContext.
 */

@Configuration
@ConditionalOnClass(SampleService.class)
public class SampleAutoconfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SampleService sampleService() {
        return new SampleService();
    }
}
