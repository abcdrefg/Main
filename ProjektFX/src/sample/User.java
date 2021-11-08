package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

class User{
    private String login;
    private String password;
    private int UserID;
    private String name;
    private String surname;




    public User(String log, String passw,int ID,String name1,String surname1){          //Konstruktor obiektu, lista gier standardowo jest pusta
        this.login=log;
        this.password=passw;
        this.UserID=ID;
        this.name=name1;
        this.surname=surname1;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword(){
        return password;
    }
    public int getUserID(){ return UserID; }
    public void setName(String name_1){
        this.name=name_1;
    }
    public void setSurname(String surname_1){
        this.surname=surname_1;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}


