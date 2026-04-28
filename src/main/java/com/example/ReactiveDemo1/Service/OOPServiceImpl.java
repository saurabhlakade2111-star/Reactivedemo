package com.example.ReactiveDemo1.Service;

import com.example.ReactiveDemo1.Entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class OOPServiceImpl implements OOPService{
    @Override
    public Payment UPI() {
        return new Payment(
                112,
                "ganesh",
                458,
                1000,
                "done"
        );
    }

}
