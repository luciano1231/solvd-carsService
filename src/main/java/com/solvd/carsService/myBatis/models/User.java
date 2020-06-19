package com.solvd.carsService.myBatis.models;

public class User {
    private Long id;    
    private String userName;
    private String userEmail;
    private int userContact;

    public User(Long id, String userName, String userEmail, int userContact) {
        this.id = id;        
        this.userName = userName;
        this.userEmail = userEmail;
        this.userContact = userContact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserContact() {
        return userContact;
    }

    public void setUserContact(int userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
}
