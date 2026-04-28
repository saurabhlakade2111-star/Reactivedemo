package com.example.ReactiveDemo1.dto;

public class productdto {

    @Override
    public String toString() {
        return "productdto{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
