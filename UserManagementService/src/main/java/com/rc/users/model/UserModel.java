package com.rc.users.model;



import javax.persistence.*;

/**
 * Created by root on 3/13/17.
 */
@Entity
@Table(name="T_users")
public class UserModel {
    @Id
    @GeneratedValue
    private long id;

    public UserModel()
    {

    }

    public UserModel(String userName, String password, String age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @Column(name = "UserName")

    private String userName;
    @Column(name = "Password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Column(name = "Age")
    private String age;
}
