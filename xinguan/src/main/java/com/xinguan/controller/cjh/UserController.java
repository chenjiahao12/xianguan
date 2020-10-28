package com.xinguan.controller.cjh;

import com.xinguan.pojo.cjh.User;
import com.xinguan.service.cjh.IUserService;
import com.xinguan.utils.PageBean;
import com.xinguan.utils.ResultData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @site
 * @company
 * @create 2020-10-28 19:17
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

   @RequestMapping("/query")
    public ResultData QueryUser(){
        PageBean pageBean= new PageBean();
        List<User> users = iUserService.UserPager(pageBean);
        return ResultData.success(users);
    }

}
