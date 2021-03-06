package com.thecodevillage.myapp.models;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="account_details")
@NamedQueries({
        @NamedQuery(name="Account.findAllAccs",query="select a from Account a")
})
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String accCode;
    private String accName;
    private long custId;

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public Account(){

    }

    public Account(long id, String accCode, String accName,long custId) {
        this.id = id;
        this.accCode = accCode;
        this.accName = accName;
        this.custId = custId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }
}
