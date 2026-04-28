package com.example.ReactiveDemo1.Controller;

import com.example.ReactiveDemo1.Entity.Payment;
import com.example.ReactiveDemo1.Service.OOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OOPController {

    @Autowired
    private OOPService oopService;
    @RequestMapping("/upi")
    public Payment GetUpi()
    {
       return oopService.UPI();
    }

}
