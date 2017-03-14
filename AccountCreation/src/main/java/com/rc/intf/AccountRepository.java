package com.rc.intf;

import com.rc.model.AccountModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * Created by root on 3/3/17.
 */
public interface AccountRepository extends CrudRepository<AccountModel, Long> {
    /**
     * Find an account with the specified account number.
     *
     * @param accountNumber
     * @return The account if found, null otherwise.
     */
    public Collection<AccountModel> findByAccountNumber(String accountNumber);

   /* *//**
     * Fetch the number of accounts known to the system.
     *
     * @return The number of accounts.
     *//*
    @Query("SELECT count(*) from Account")
    public int countAccounts();*/
}
