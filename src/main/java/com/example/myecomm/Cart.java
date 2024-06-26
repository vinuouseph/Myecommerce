package com.example.myecomm.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item;
    private String uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item=item;
    }

    public String getUid(){
        return uid;
    }

    public void setUid(String uid){
        this.uid=uid;
    }

}