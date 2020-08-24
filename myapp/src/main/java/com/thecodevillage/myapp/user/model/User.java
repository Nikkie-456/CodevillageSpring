package com.thecodevillage.myapp.user.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Table(name="mk_users")
@Entity
@NamedQueries({@NamedQuery(name="User.fetchAllUsers",query = "select u from User u")})
@NamedQuery(name = "User.findUsersByCode",query = "select u from User u where u.userCode= :userCode")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userCode;
    private String userName;

    public User(long id, String userCode, String userName) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
    }

    public User(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
