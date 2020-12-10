package com.yonyou.service;

import com.yonyou.domian.Salgrade;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 20:31
 * @description：
 * @modified By：
 * @version: $
 */
public interface SalgradeService {

    void tranfer(String sourceName, String targetName, Float money);

    List<Salgrade> selectAllSal();
}
