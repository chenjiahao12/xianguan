package com.xinguan.config;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinguan.utils.PageBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author
 * @site
 * @company
 * @create 2020-07-10 14:14
 */
@Component
@Aspect
public class PagerAspect {

    @Around("execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable {
        Object[] params = args.getArgs();
        PageBean pageBean = null;
        for (Object param : params) {
            if (param instanceof PageBean) {
                pageBean = (PageBean) param;
                break;
            }
        }
        if (pageBean != null && pageBean.isPagination())
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
            Object proceed = args.proceed(params);

        if (pageBean != null && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo((List) proceed);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return proceed;
    }
}
