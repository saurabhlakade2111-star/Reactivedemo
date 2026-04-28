package com.example.ReactiveDemo1.Service;

import com.example.ReactiveDemo1.Entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class OOPServiceImpl implements OOPService{
    @Override
    public Payment UPI() {
        return Payment.builder().name("ganesh")
                .accNo(112)
                .receiverAcc(458)
                .ammount(1000)
                .status("done")
                .build();
    }

    @Override
    public void login(String user, String pass) {
        if(user.equalsIgnoreCase(user))
        {
            System.out.println("login user pass");
        }
    }

    @Override
    public void login(int phone, String pass) {

    }
    
}
