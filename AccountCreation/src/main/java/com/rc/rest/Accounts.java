package com.rc.rest;

/**
 * Created by root on 3/2/17.
 */

import com.rc.exception.AccountNotFoundException;
import com.rc.intf.AccountRepository;
import com.rc.model.AccountModel;
import com.sun.jersey.server.wadl.generators.resourcedoc.model.ResponseDocType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/accounts")
public class Accounts {

    private List<AccountModel> accounts;
    @Autowired
    private AccountRepository accountRepository;
    protected Logger logger = Logger.getLogger(Accounts.class
            .getName());


    /*public Accounts(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<AccountModel>> getAllAccounts(){
        System.out.println("Entry >> GetAll Accounts");
        return new ResponseEntity<>((Collection<AccountModel>) accountRepository.findAll(), HttpStatus.OK);
    }

    /**
     * Fetch an account with the specified account number.
     *
     * @param accountNumber
     *            A numeric, 9 digit account number.
     * @return The account if found.
     * @throws AccountNotFoundException
     *             If the number is not recognised.
     */
@RequestMapping(method = RequestMethod.GET, params = {"accountNumber"})
    public ResponseEntity<Collection<AccountModel>> byNumber(@RequestParam(value="accountNumber") String accountNumber) {
    System.out.println("Entry >> GetAll Accounts by Account Number");
        logger.info("accounts-service byNumber() invoked: " + accountNumber);
        Collection<AccountModel> account = accountRepository.findByAccountNumber(accountNumber);
        logger.info("accounts-service byNumber() found: " + account);

        if (account == null)
            throw new AccountNotFoundException(accountNumber);
        else {
            return new ResponseEntity<>((Collection<AccountModel>) accountRepository.findAll(), HttpStatus.OK);
        }
    }
}
