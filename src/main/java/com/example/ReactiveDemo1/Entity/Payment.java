package com.example.ReactiveDemo1.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {

    private long accNo;
    private String name;
    private long receiverAcc;
    private int ammount;
    private String status;

}
