package com.rc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by root on 3/2/17.
 */
@Entity
@Table(name = "T_ACCOUNT")
public class AccountModel implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private int accountNumber;
    @Column(nullable = false)
    private String name;
    //@Column
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column

    private int age;
    @Column
    private Date dateOfBirth;

    @Override
    public String toString() {
        return "AccountModel{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", sex='" + sex + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    private String sex;
    private String accountType;

    public AccountModel(){

    }

    public AccountModel(int accountNumber, String name, Address address, int age, Date dateOfBirth, String sex, String accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
