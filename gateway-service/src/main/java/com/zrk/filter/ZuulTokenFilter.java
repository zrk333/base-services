package com.zrk.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Description: 权限过滤器
 * @Author: zrk
 * @Date: 2019/9/12
 */
@Slf4j
@Component
public class ZuulTokenFilter extends ZuulFilter {
    /**
     * @return 过滤器类型
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * @return 过滤器的级别
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * @return 过滤器是否起作用
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
