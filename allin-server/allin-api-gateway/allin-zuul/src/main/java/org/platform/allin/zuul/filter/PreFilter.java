package org.platform.allin.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 预处理filter，验证cookie，header信息
 * @author heshiyuan
 */
@Slf4j
public class PreFilter extends ZuulFilter {
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
        return FilterConstants.PRE_TYPE;
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
        // filter需要执行的具体操作
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Cookie[] cookies = request.getCookies();
        /*if(null==cookies||cookies.length<=0){
            log.warn("【PreFilter】请求地址：{};cookie中没有数据，系统禁止无状态请求", request.getRequestURI());
            // 对该请求禁止路由，也就是禁止访问下游服务
            ctx.setSendZuulResponse(false);
            // 摸清楚跟http response区别 设定ResponseBody，供PostFilter使用
            ctx.setResponseBody("请求中没有cookie 信息");
        }else{
            log.info("【PreFilter】放行:{}", request.getRequestURI());

        }*/
        log.info("【PreFilter】放行:{}", request.getRequestURI());
        return null;
    }
}