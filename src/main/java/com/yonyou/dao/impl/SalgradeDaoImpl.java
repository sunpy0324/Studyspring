package com.yonyou.dao.impl;

import com.yonyou.dao.SalgradeDao;
import com.yonyou.domian.Salgrade;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 20:30
 * @description：
 * @modified By：
 * @version: $
 */
@Repository("salgradeDao")
public class SalgradeDaoImpl implements SalgradeDao {

    @Autowired
    private QueryRunner runner;

    @Override
    public Salgrade selectSalByName(String name) {
        String sql = "select * from salgrade where name=?";
        try {
            List<Salgrade> sals = runner.query(sql, new BeanListHandler<Salgrade>(Salgrade.class), name);
            if(sals == null || sals.size()==0) {
                return null;
            }
            if(sals.size() > 1) {
                throw new RuntimeException("结果集不唯一，数据有问题");
            }
            return sals.get(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateSal(Salgrade sal) {
        String sql = "update salgrade set sal=? where id=? and name=?";
        try {
            runner.update(sql,sal.getSal(),sal.getId(),sal.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Salgrade> selectAllSal() {
        String sql = "select * from salgrade";
        try {
            return runner.query(sql,new BeanListHandler<Salgrade>(Salgrade.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
