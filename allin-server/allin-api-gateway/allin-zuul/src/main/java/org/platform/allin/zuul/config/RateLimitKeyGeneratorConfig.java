//package org.platform.allin.zuul.config;
//
//import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimitKeyGenerator;
//import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimitUtils;
//import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.properties.RateLimitProperties;
//import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.support.DefaultRateLimitKeyGenerator;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.cloud.netflix.zuul.filters.Route;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.StringJoiner;
//
///**
// * @author heshiyuan
// * @description <p>自定义限流key</p>
// * @path allin-server/org.platform.allin.zuul.config
// * @date 2019/9/25 22:53
// */
//@Configuration
//public class RateLimitKeyGeneratorConfig {
//
//    @Bean
//    public RateLimitKeyGenerator rateLimitKeyGenerator(final RateLimitProperties properties, final RateLimitUtils rateLimitUtils;){
//        return new DefaultRateLimitKeyGenerator(properties, null){
//            @Override
//            public String key(final HttpServletRequest request, final Route route, final RateLimitProperties.Policy policy) {
//                final StringJoiner joiner = new StringJoiner(":");
//                joiner.add(properties.getKeyPrefix());
//                if (route != null) {
//                    joiner.add(route.getId());
//                }
//                policy.getType().forEach(matchType -> {
//                    String key = matchType.key(request, route, rateLimitUtils);
//                    if (StringUtils.isNotEmpty(key)) {
//                        joiner.add(key);
//                    }
//                });
//                return joiner.toString();
//            }
//        }
//
//    }
//}
