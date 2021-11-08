package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.*;

public class Main extends Application {
    private int IDLoggedUser;

    public void setIDLoggedUser(int ID){
        this.IDLoggedUser=ID;
    }
    public int getIDLoggedUser(){
        return IDLoggedUser;
    }

    //Korzystanie z metod z maina
    private static Main mainInstance;
    public Main() {
        mainInstance = this;
    }
    public static Main getInstance() {
        return mainInstance;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 520, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
