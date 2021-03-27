package com.cyanfox.service.impl;

import com.cyanfox.dao.AccountDao;
import com.cyanfox.dao.entity.Account;
import com.cyanfox.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    private SqlSession session;
    private InputStream in;

    public AccountServiceImpl() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        accountDao = session.getMapper(AccountDao.class);
    }

    public void destroy() throws IOException {
        session.close();
        in.close();
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }

    public void insert(Account record) {
        accountDao.insert(record);
    }

    // 4通过id查找对象
    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }

    // 5更新Account
    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
    }

    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账
    public void transfer(String remitterId, String remitteeId, int money) {
        Account reminter = accountDao.selectByPrimaryKey(remitterId);
        Account remintee = accountDao.selectByPrimaryKey(remitteeId);

        reminter.setMoney(reminter.getMoney() - money);
        remintee.setMoney(remintee.getMoney() + money);

        accountDao.updateByPrimaryKey(reminter);
        accountDao.updateByPrimaryKey(remintee);
        session.commit();
    }


}
