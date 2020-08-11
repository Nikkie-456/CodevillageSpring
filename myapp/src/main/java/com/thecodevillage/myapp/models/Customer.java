package com.thecodevillage.myapp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name="cash_customers")
@NamedQueries({
        @NamedQuery(name = "Customer.findAllCustomers",query = "select c from Customer c")
})

public class Customer implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String idNumber;
    private String name;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(long id, String idNumber, String name) {
        this.id = id;
        this.idNumber = idNumber;
        this.name = name;
    }
}
