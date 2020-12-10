package com.yonyou.dao;

import com.yonyou.domian.Account;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 14:27
 * @description：
 * @modified By：
 * @version: $
 */
public interface AccountDao {

    List<Account> selectAllAccount();

    Account findById(Integer id);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer id);
}
