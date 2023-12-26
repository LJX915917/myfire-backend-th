package com.studygroup.myfire.backend.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ConditionalOnProperty(prefix = "spring.swagger", value = "enable", havingValue = "false")
public class MyWebMvcConfiguration extends WebMvcConfigurationSupport {

    /**
     * 静态资源映射
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        registry.addResourceHandler("/assets/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/assets/");
        registry.addResourceHandler("/devops/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/devops/");
        registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/");
        super.addResourceHandlers(registry);
    }

}
