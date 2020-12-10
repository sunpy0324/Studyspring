package com.yonyou.test;

import config.SpringConfiguration;
import com.yonyou.domian.Account;
import com.yonyou.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 17:05
 * @description：
 * @modified By：
 * @version: $
 */
public class TestClient {

    @BeforeClass
    public AccountService init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        return (AccountService) ac.getBean("accountService",AccountService.class);
    }

    @Test
    public void selectAll() {
        AccountService accountService = init();
        List<Account> accounts = accountService.selectAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
