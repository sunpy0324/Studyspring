package com.yonyou.service.impl;

import com.yonyou.dao.AccountDao;
import com.yonyou.domian.Account;
import com.yonyou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 14:29
 * @description：
 * @modified By：
 * @version: $
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    public List<Account> selectAllAccount() {
        return accountDao.selectAllAccount();
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }
}
