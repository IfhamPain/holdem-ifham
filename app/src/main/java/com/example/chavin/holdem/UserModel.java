package com.example.chavin.holdem;

/**
 * Created by Chavin on 5/5/2017.
 */

public class UserModel {
        String name;
        String email;
        String password;
        String dob;
        String gender;
        String alarm;
        String date;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAlarm(String alarm){
        this.alarm = alarm;
    }
    public String getAlarm(){
        return alarm;
    }

    public void setDate(String date){ this.date = date;}
    public String getDate(){ return date;}
    public UserModel(){

    }

}
