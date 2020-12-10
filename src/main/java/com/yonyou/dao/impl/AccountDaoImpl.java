package com.yonyou.dao.impl;

import com.yonyou.dao.AccountDao;
import com.yonyou.domian.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


import java.sql.SQLException;
import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 14:27
 * @description：
 * @modified By：
 * @version: $
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private QueryRunner runner;


    public List<Account> selectAllAccount() {
        try {
            return runner.query("select * from Account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account findById(Integer id) {
        try {
            return runner.query("select * from Account where id = ?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            runner.update("insert into account(food,price) values(?,?)",new BeanHandler<Account>(Account.class),account.getFood(),account.getPrice());
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    public void updateAccount(Account account) {
        try {
            runner.update("update account set food=?,price=? where id=?",new BeanHandler<Account>(Account.class),account.getId(),account.getFood(),account.getPrice());
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    public void deleteAccount(Integer id) {
        try {
            runner.update("delete from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
