package com.yonyou.test;

import com.yonyou.domian.Salgrade;
import com.yonyou.service.SalgradeService;
import config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 21:0
 *
 * 9
 * @description：
 * @modified By：
 * @version: $
 */
public class TestSalgradeClient {

    @Test
    public void TestTranfer() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        SalgradeService salgradeService = ac.getBean("salgradeService",SalgradeService.class);
        salgradeService.tranfer("张三","王五",100f);

    }

    @Test
    public void selectAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        SalgradeService salgradeService = ac.getBean("salgradeService",SalgradeService.class);
        List<Salgrade> salgrades = salgradeService.selectAllSal();
        for(Salgrade salgrade : salgrades) {
            System.out.println(salgrade);
        }
    }
}
