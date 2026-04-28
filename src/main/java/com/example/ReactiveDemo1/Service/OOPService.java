package com.example.ReactiveDemo1.Service;

import com.example.ReactiveDemo1.Entity.Payment;
import org.springframework.stereotype.Service;
@Service
public interface OOPService {

    public Payment UPI();

    public void login(String user,String pass);

    public void login(int phone,String pass);
}
