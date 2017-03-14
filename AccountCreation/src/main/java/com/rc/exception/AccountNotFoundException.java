package com.rc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by root on 3/3/17.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public AccountNotFoundException(String accountNumber) {
        super("No such account: " + accountNumber);
    }
}
