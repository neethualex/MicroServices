package com.rc.users.repository;

import com.rc.users.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by root on 3/13/17.
 */
public interface UserManagementRepository extends CrudRepository<UserModel,Long> {

    public Collection<UserModel> findByUserName(String userName);

}
