package com.example.javamongo.user;

import com.fasterxml.jackson.databind.node.LongNode;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    //getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
       this.id = id;
    }

    //name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //email
    public String getEmail(){
        return email;
    }

    public void setEmail(String name){
        this.name = email;
    }

}
