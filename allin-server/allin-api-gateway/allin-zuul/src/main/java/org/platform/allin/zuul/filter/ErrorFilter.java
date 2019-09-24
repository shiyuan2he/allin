package org.platform.allin.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 预处理filter，验证cookie，header信息
 * @author heshiyuan
 */
@Slf4j
public class ErrorFilter extends ZuulFilter {
    /**
     * 定义filter的类型，有pre、route、post、error四种
     * pre：在zuul按照规则路由到下级服务之前执行，如果需要对请求进行预处理，不如鉴权，限流等都应考虑再次filter执行
     * route：zuul路由动作的执行者。是Apache HttpClient或者netflix Ribbon构建和发送原始http请求的地方。支持OkHttp
     * post：源服务返回结果或者异常信息发生后执行的，如果需要对返回信息做一些处理，则在此filter类进行处理
     * error：在整个生命周期内如果发生异常，则会进入error filter，可做全局异常处理
     *
     * 各Filter之间通过RequestContext进行通信
     */
    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }

    /**
     * 定义filter的顺序，数字越小表示顺序越高，越先执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 表示是否需要执行该filter，true表示执行，false表示不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("【ErrorFilter】放行:{}", request.getRequestURI());
        return null;
    }
}