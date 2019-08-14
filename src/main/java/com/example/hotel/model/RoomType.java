package com.example.hotel.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum  RoomType {

   Delux("3 person",2000000),
  Luxury("3 person",3000000),
  Economy("3 person",80000),
    ExtraBed("1 person",50000);


   RoomType(String name, double price){
       this.name=name;
       this.price=price;
   }
    String name;
    double price;

    public String getName(){
        return this.name;
    }

    public  double getPrice(){
       return this.price;
    }
}
