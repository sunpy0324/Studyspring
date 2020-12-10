package com.yonyou.dao;

import com.yonyou.domian.Salgrade;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 20:27
 * @description：
 * @modified By：
 * @version: $
 */

public interface SalgradeDao {

    Salgrade selectSalByName(String name);

    void updateSal(Salgrade sal);

    List<Salgrade> selectAllSal();
}
