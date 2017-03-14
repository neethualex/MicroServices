package com.rc.users.service;

import com.rc.users.model.UserModel;
import com.rc.users.repository.UserManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by root on 3/13/17.
 */
@RestController
@RequestMapping("/users")
public class UserManagementService {

    private List<UserModel> users;

    @Autowired
    private UserManagementRepository userManagementRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<UserModel>> getAllUsers() {
        System.out.println("Get All users Entry");
        return new ResponseEntity<>((Collection<UserModel>) userManagementRepository.findAll(), HttpStatus.OK);
    }

}
