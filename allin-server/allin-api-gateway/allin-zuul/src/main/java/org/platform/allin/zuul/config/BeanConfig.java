package org.platform.allin.zuul.config;

import org.platform.allin.zuul.filter.AccessSessionFilter;
import org.platform.allin.zuul.filter.ErrorFilter;
import org.platform.allin.zuul.filter.PostFilter;
import org.platform.allin.zuul.filter.PreFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.zuul.config
 * @date 2019/9/19 09:23
 */
@Configuration
public class BeanConfig {

    @Bean
    public AccessSessionFilter accessSessionFilter(){
        return new AccessSessionFilter();
    }

    @Bean
    public PreFilter preFilter(){
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter(){
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }
}
