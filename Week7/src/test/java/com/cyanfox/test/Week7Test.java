package com.cyanfox.test;

import com.cyanfox.dao.entity.Account;
import com.cyanfox.service.AccountService;
import com.cyanfox.service.impl.AccountServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Week7Test {

    @Test
    public void test() throws IOException {
        AccountService service = new AccountServiceImpl();
        service.insert(new Account("1","jack",1000,new Date(),new Date()));
        service.insert(new Account("2","tom",500,new Date(),new Date()));
        service.insert(new Account("3","micky",800,new Date(),new Date()));

        service.transfer("2","3",500);
        List<Account> list = service.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        service.destroy();
    }
}
