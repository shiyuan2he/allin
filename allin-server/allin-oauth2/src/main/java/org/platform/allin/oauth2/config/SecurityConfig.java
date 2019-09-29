package org.platform.allin.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path allin-server/org.platform.allin.oauth2.config
 * @date 2019/9/19 22:13
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("guest").password("guest").authorities("WRIGTH_READ")
                .and()
                .withUser("admin").password("admin").authorities("WRIGTH_READ", "WRIGTH_WRITE");
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
