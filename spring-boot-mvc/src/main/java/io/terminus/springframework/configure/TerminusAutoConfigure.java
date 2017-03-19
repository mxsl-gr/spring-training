package io.terminus.springframework.configure;

import io.terminus.springframework.service.TerminusUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gengrong on 2017/3/19.
 */
@Configuration
@EnableConfigurationProperties(TerminusProperties.class)
public class TerminusAutoConfigure {

    @Autowired
    private TerminusProperties terminusProperties;

    @Bean
    @ConditionalOnProperty("terminus.name")
    public TerminusUserService terminusUserService() {
        final String name = terminusProperties.getName();
        return () -> name;
    }
}
