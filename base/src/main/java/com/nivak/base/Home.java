package com.nivak.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
@Component
//@Scope(value = "prototype")
public class Home {
    //POJO Classes
    private String houseOwner;
    private int doorNo;

 
    @Autowired
    @Qualifier("abc")
    private InternetConnect modem;

    public Home(){
        System.out.println("Home Home");
    }
    public String getHouseOwner() {
        return houseOwner;
    }
    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void connect(){
        modem.switchOn();
        System.out.println("Connecting to internet");
    }
}
