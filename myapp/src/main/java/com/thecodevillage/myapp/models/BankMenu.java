package com.thecodevillage.myapp.models;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="bank_menu")
@NamedQueries({
        @NamedQuery(name = "BankMenu.findAllMenu",query = "select b from BankMenu b")
})
public class BankMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String menuCode;
    private String menuName;

    public BankMenu() {

    }

    public BankMenu(long id, String menuCode, String menuName) {
        this.id = id;
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
