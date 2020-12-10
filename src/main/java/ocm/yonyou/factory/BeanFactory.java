package ocm.yonyou.factory;

import ocm.yonyou.service.AccountService;
import ocm.yonyou.service.impl.AccountServiceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-22 13:37
 * @description：
 * @modified By：
 * @version: $
 */
public class BeanFactory {

    // private static Properties props = null;
    // private static Map<String,Object> map = null;
    //
    // static{
    //
    //     try {
    //         props = new Properties();
    //         InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
    //         props.load(is);
    //         map = new HashMap<String, Object>();
    //         Enumeration enumeration = props.keys();
    //         while(enumeration.hasMoreElements()) {
    //             String beanName = enumeration.nextElement().toString();
    //             String beanPath = props.getProperty(beanName);
    //             Object bean = Class.forName(beanPath).newInstance();
    //             map.put(beanName,bean);
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //
    // }
    //
    // public static Object getBean(String beanName) {
    //     // Object bean = null;
    //     // String beanPath = props.getProperty(beanName);
    //     // try {
    //     //     bean = Class.forName(beanPath).newInstance();
    //     // } catch (InstantiationException e) {
    //     //     e.printStackTrace();
    //     // } catch (IllegalAccessException e) {
    //     //     e.printStackTrace();
    //     // } catch (ClassNotFoundException e) {
    //     //     e.printStackTrace();
    //     // }
    //     // return bean;
    //
    //     return map.get(beanName);
    // }

    // public AccountService getAccountService() {
    //     int i = 1;
    //     System.out.println(i++);
    //     return new AccountServiceImpl();
    // }
}
