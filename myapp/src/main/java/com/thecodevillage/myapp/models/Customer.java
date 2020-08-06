package com.thecodevillage.myapp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {

    private long id;
    private String idNumber;
    private String name;

    public Customer(long id, String idNumber, String name) {
        this.id = id;
        this.idNumber = idNumber;
        this.name = name;
    }
}
