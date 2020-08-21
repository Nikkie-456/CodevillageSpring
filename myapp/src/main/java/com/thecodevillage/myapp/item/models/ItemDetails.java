package com.thecodevillage.myapp.item.models;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="items")
@NamedQueries({
        @NamedQuery(name="ItemDetails.findAllItms",query = "Select i from ItemDetails i")
})
public class ItemDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String itemCode;
    private String itemName;

    public ItemDetails(long id, String itemCode, String itemName) {
        this.id = id;
        this.itemCode = itemCode;
        this.itemName = itemName;
    }

    public ItemDetails(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
