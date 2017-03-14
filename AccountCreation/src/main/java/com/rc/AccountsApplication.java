package com.rc;

import com.rc.intf.AccountRepository;
import com.rc.model.AccountModel;
import com.rc.model.Address;
import com.rc.service.accounts.AccountCreationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 * Created by root on 3/3/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableAutoConfiguration
@Import(AccountCreationService.class)
public class AccountsApplication {
    protected Logger logger = Logger.getLogger(AccountsApplication.class.getName());
    //private final AccountModel account = new AccountModel();
    public static void main(String args[])
    {

        System.setProperty("spring.config.name","registration-server");
        SpringApplication.run(AccountsApplication.class,args);
    }

    @Bean
    public CommandLineRunner initializeDb(AccountRepository repository){
        return (args) -> {
            repository.deleteAll();
            String strDate = "1981-14-10 00:00:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            java.util.Date date = sdf.parse(strDate);

            java.sql.Date sqlDate = new Date(date.getTime());
            //Insert some random pies
            //for(int i = 0; i < 20; i++) {
                Address address = new Address("100","Normantown Road","1512","Dupage","Naperville","IL",60564);
                repository.save(new AccountModel(1000, "Alex Jeyasingh",address,35,sqlDate,"Male","Savings"));
            //}
        };
    }
}
