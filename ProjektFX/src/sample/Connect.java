package sample;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Connect {
    public static final String DRIVER = "org.sqlite.JDBC";
    private Connection conn;
    private Statement stat;
    private int ID_Logged_User;


    public Connect() {
        conn = null;
        ID_Logged_User=0;
        try {
            Class.forName(Connect.DRIVER);
        } catch (Exception ex) {
            System.err.println("Wymagany sterownik JDBC");
            // handle the error
        }

        try {
            // db parameters
            String url = "jdbc:sqlite:users.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<User> selectLoggedUser() {
        List<User> users = new LinkedList<User>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM users WHERE users.id_usera="+Main.getInstance().getIDLoggedUser());
            int id;
            String login, passw,name,surname;
            while (result.next()) {
                id = result.getInt("id_usera");
                login = result.getString("login");
                passw = result.getString("password");
                name = result.getString("imie");
                surname = result.getString("nazwisko");
                users.add(new User(login, passw, id,name,surname));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }
    public List<User> selectUsers() {
        List<User> users = new LinkedList<User>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM users");
            int id;
            String login, passw,name,surname;
            while (result.next()) {
                id = result.getInt("id_usera");
                login = result.getString("login");
                passw = result.getString("password");
                name = result.getString("imie");
                surname = result.getString("nazwisko");
                users.add(new User(login, passw, id,name,surname));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }
    public List<String> selectLogins() {
        List<String> logins = new ArrayList<String>();
        try {
            ResultSet result = stat.executeQuery("SELECT login FROM users");
            int id;
            String login;
            while (result.next()) {
                login = result.getString("login");
                logins.add(login);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return logins;
    }

    public boolean insertUser(String login, String passw, String name, String forname){
        try {
            PreparedStatement prepStmt = conn.prepareStatement("insert into users values (NULL, ?, ?, ?, ?);");
            prepStmt.setString(1, login);
            prepStmt.setString(2, passw);
            prepStmt.setString(3, name);
            prepStmt.setString(4, forname);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu usera");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean insertGame(int Game_ID){
        try {
            PreparedStatement prepStmt = conn.prepareStatement("insert into Biblioteka values (?, ?);");
            prepStmt.setInt(2, Game_ID);
            prepStmt.setInt(1, Main.getInstance().getIDLoggedUser());
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu Gry do biblioteki");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public ArrayList<Integer> selectLib() {
        ArrayList<Integer> lib = new ArrayList<Integer>();
        try {
            ResultSet result = stat.executeQuery("SELECT Biblioteka.Idgry FROM Biblioteka WHERE Biblioteka.Idusera=" + Main.getInstance().getIDLoggedUser());
            int id;
            String nazwa;
            while (result.next()) {
                id = result.getInt("Idgry");
                lib.add(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return lib;
    }

}
