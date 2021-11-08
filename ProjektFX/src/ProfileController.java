package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;
import sample.Connect;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


public class ProfileController implements Initializable {

    //Label u góry z nazwą użytkownika
    @FXML private ImageView profileImageView;
    @FXML private Label mainUsernameLabel;
    @FXML private Label usernameLabel;
    @FXML private Label nameLabel;
    @FXML private Label surnameLabel;
    @FXML private Label passwordLabel;
    @FXML private Label gamesCountLabel;
    @FXML private Label timeSpentLabel;
    @FXML private Label favGameLabel;
    //Tło (zamiast CSSa:/)
    @FXML private ImageView padImageView1;
    @FXML private ImageView padImageView2;
    @FXML private ImageView padImageView3;
    @FXML private ImageView padImageView4;
    @FXML private ImageView padImageView5;
    @FXML private ImageView padImageView6;
    @FXML private ImageView padImageView7;
    @FXML private ImageView iconImageView1;
    @FXML private ImageView iconImageView2;
    @FXML private ImageView iconImageView3;
    @FXML private ImageView iconImageView4;
    @FXML private ImageView iconImageView5;
    @FXML private ImageView iconImageView6;
    @FXML private ImageView cartImageView1;
    @FXML private ImageView cartImageView2;
    @FXML private ImageView playImageView;

    private Connect temporary1 = new Connect();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Avatar użytkownika
        File profileFile = new File("img/user_profile.png");
        Image profileImage = new Image(profileFile.toURI().toString());
        profileImageView.setImage(profileImage);
        //----------------Tło-----------------
        //Ikony padów
        File padFile = new File("img/library.png");
        Image padImage = new Image(padFile.toURI().toString());
        padImageView1.setImage(padImage);
        padImageView2.setImage(padImage);
        padImageView3.setImage(padImage);
        padImageView4.setImage(padImage);
        padImageView5.setImage(padImage);
        padImageView6.setImage(padImage);
        padImageView7.setImage(padImage);
        //Ikony z logiem
        File iconFile = new File("img/logo.png");
        Image iconImage = new Image(iconFile.toURI().toString());
        iconImageView1.setImage(iconImage);
        iconImageView2.setImage(iconImage);
        iconImageView3.setImage(iconImage);
        iconImageView4.setImage(iconImage);
        iconImageView5.setImage(iconImage);
        iconImageView6.setImage(iconImage);
        //Ikony z wózkiem
        File cartFile = new File("img/shop.png");
        Image cartImage = new Image(cartFile.toURI().toString());
        cartImageView1.setImage(cartImage);
        cartImageView2.setImage(cartImage);
        //Ikony play
        File playFile = new File("img/play.png");
        Image playImage = new Image(playFile.toURI().toString());
        playImageView.setImage(playImage);
        //Wypisywanie danych w profilu
        List<User> temp1 = new LinkedList<User>();
        temp1=temporary1.selectLoggedUser();
        mainUsernameLabel.setText(temp1.get(0).getLogin());
        usernameLabel.setText(temp1.get(0).getLogin());
        nameLabel.setText(temp1.get(0).getName());
        surnameLabel.setText(temp1.get(0).getSurname());
        passwordLabel.setText(temp1.get(0).getPassword());
    }
}
