package com.xinguan;

import com.xinguan.pojo.cjh.User;
import com.xinguan.service.cjh.IUserService;
import com.xinguan.utils.PageBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class XinguanApplicationTests {
    @Autowired
    private IUserService userServer;

    @Test
    void contextLoads() {

        PageBean pageBean = new PageBean();
        pageBean.setPage(2);
        List<User> users = userServer.UserPager(pageBean);
        users.forEach(System.out::println);
    }

}
