package org.platform.allin.zuul.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author heshiyuan
 * @description <p>
 *     EnableOAuth2Sso必须，开启oauth2
 * </p>
 * @path allin-server/org.platform.allin.zuul.config
 * @date 2019/9/19 22:20
 */
@Order(101)
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/login", "/producer/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                    .csrf()
                    .disable();
    }
}
