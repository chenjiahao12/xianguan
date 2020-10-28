package com.xinguan.service.cjh.Impl;

import com.xinguan.exception.GlobalException;
import com.xinguan.mapper.cjh.UserMapper;
import com.xinguan.pojo.cjh.User;
import com.xinguan.service.cjh.IUserService;
import com.xinguan.utils.CodeMsg;
import com.xinguan.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @site
 * @company
 * @create 2020-10-28 18:56
 */
@Service
public class IUserServerImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> UserPager(PageBean pageBean) {
        List<User> users = userMapper.UserPager();
    /*    if (users!=null){
            throw new GlobalException(CodeMsg.ERR);
        }*/
        return users;
    }
}
