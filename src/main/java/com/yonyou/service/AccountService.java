package com.yonyou.service;

import com.yonyou.domian.Account;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 14:29
 * @description：
 * @modified By：
 * @version: $
 */
public interface AccountService {

    List<Account> selectAllAccount();

    Account findById(Integer id);

    void saveAccount(Account account);

    void deleteAccount(Integer id);

    void updateAccount(Account account);
}
