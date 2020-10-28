package com.xinguan.service.cjh;

import com.xinguan.pojo.cjh.User;
import com.xinguan.utils.PageBean;

import java.util.List;

/**
 * @author
 * @site
 * @company
 * @create 2020-10-28 18:52
 */
public interface IUserService {

    List<User> UserPager(PageBean pageBean);
}
