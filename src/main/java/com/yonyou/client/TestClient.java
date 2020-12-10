package com.yonyou.client;

import com.yonyou.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 14:30
 * @description：
 * @modified By：
 * @version: $
 */
public class TestClient {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean---备份---.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.selectAllAccount();
    }
}
