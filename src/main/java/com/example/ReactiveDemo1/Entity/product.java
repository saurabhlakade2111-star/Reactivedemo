package com.example.ReactiveDemo1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product") // Explicitly defining table name
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true) // Ensure it's unique and not null
    private int id;

    private String type;
    private String name;

    public product() {
    }

    public product(int id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
