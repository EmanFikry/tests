/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dataBaseClasses;



import java.util.Date;

import java.util.ArrayList;



/**
 *
 * @author Ahmed
 */
public class User {

    private String email;
    private String name;
    private String password;
    private Date birthdate;
    private String job;
    private float creditLimit;
    private String address;

    private int user_id ;
    private ArrayList<String> interest;

    public User() {
    }

    public User(String email, String name, String password, Date birthdate, String job, float creditLimit, String address, int user_id, ArrayList<String> interest) {

        this.email = email;
        this.name = name;
        this.password = password;
        this.birthdate = birthdate;
        this.job = job;
        this.creditLimit = creditLimit;
        this.address = address;

        this.user_id = user_id;
        this.interest = interest;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
public String tostString()
{
return "User{" + "email=" + email + ", name=" + name + ", password=" + password + ", birthdate=" + birthdate + ", job=" + job + ", creditLimit=" + creditLimit + ", address=" + address +  '}';
} 


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public ArrayList<String> getInterest() {
        return interest;
    }

    public void setInterest(ArrayList<String> interest) {
        this.interest = interest;
    }


}