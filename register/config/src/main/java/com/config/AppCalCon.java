package com.config;

/**
 * Created by student on 2016/03/13.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCalCon
{
    @Bean(name="calc")
    public AppConfig getService()
    {
        return new AppConfigImpl();
    }

}
