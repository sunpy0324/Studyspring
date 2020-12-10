package ocm.yonyou.service.impl;

import ocm.yonyou.service.AccountService;

import java.util.Date;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-22 13:33
 * @description：
 * @modified By：
 * @version: $
 */
public class AccountServiceImpl implements AccountService {

    // private AccountDao accountDao = new AccountDaoImpl();
    //
    // public AccountServiceImpl(){
    //     System.out.println("对象创建了");
    // }
    // private static AccountDao accountDao = null;

    // public void selectAllAccount() {
    //
    //     accountDao.selectAllAccount();
    // }

    private String name;
    private Integer age;
    private Date date;

    public AccountServiceImpl(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    @Override
    public String toString() {
        System.out.println("方法被执行了");
        System.out.println( "AccountServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}');
        return "";
    }
}
