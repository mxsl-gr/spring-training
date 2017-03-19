package io.terminus.springframework.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by gengrong on 2017/3/19.
 */
@ConfigurationProperties(prefix = "terminus")
public class TerminusProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
