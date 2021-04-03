package com.cyanfox.controller;

import com.cyanfox.entity.Account;
import com.cyanfox.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/all")
    @ResponseBody
    public List<Account> findAll(){
        return accountService.findAll();
    }

    @RequestMapping("/account/save")
    public void saveAccount(@RequestBody Account account){

    }

    @RequestMapping("/account/transfer")
    public void transfer(@RequestParam("remitterID") String remitterID,
                         @RequestParam("remitteeID") String remitteeID,
                         @RequestParam("money") int money){

    }
}
