package com.cyanfox.test;

import com.cyanfox.dao.AccountDao;
import com.cyanfox.dao.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    private  InputStream in;
    private SqlSession session;
    private AccountDao accountDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        session=factory.openSession();
        accountDao=session.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws Exception{

        session.commit();
        session.close();
        in.close();
    }


    @Test
    public void testFindAll(){
        List<Account> accounts=accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testInsert(){
        Account account=new Account();
        account.setId("2");
        account.setName("ltz");
        account.setMoney(10000);
        account.setUpdatetime(new Date());
        account.setCreatetime(new Date());
        accountDao.insert(account);
    }

    @Test
    public void testUpdate(){
        Account account=new Account();
        account.setId("1");
        account.setName("ltz");
        account.setMoney(10000);
        account.setUpdatetime(new Date());
        account.setCreatetime(new Date());
        accountDao.updateByPrimaryKey(account);
    }

    @Test
    public void testDelete(){
        accountDao.deleteByPrimaryKey("1");
    }

    
    @Test
    public void testFindById(){
        Account account=accountDao.selectByPrimaryKey("1");
        System.out.println(account);

    }
}
