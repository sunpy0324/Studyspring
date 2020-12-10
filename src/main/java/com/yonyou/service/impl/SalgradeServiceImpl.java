package com.yonyou.service.impl;

import com.yonyou.dao.SalgradeDao;
import com.yonyou.domian.Salgrade;
import com.yonyou.service.SalgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-12-02 20:32
 * @description：
 * @modified By：
 * @version: $
 */
@Service("salgradeService")
public class SalgradeServiceImpl implements SalgradeService {

    @Autowired
    private SalgradeDao salgradeDao;

    @Override
    public void tranfer(String sourceName, String targetName, Float money) {
        // 1、获取转入账户
        Salgrade targetSal = salgradeDao.selectSalByName(targetName);
        // 2、获取转出账户
        Salgrade sourceSal = salgradeDao.selectSalByName(sourceName);
        // 3、转出账户转出钱
        sourceSal.setSal(sourceSal.getSal()-money);
        // 4、转入账户转入钱
        targetSal.setSal(targetSal.getSal()+money);
        // 5、转出账户更新
        salgradeDao.updateSal(sourceSal);
        // 6、转入账户更新
        salgradeDao.updateSal(targetSal);
    }

    @Override
    public List<Salgrade> selectAllSal() {
        return salgradeDao.selectAllSal();
    }
}
