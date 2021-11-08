package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML private ImageView registerImageView;
    @FXML private Button closeButton;
    @FXML private Label registrationMessageLabel1;
    @FXML private Label registrationMessageLabel2;
    @FXML private PasswordField setPasswordField;
    @FXML private PasswordField confirmPasswordField;
    @FXML private Label confirmPasswordLabel;
    @FXML private TextField usernameTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField surnameTextField;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Ikona rejestracji
        File registerFile = new File("img/register_icon.png");
        Image registerImage = new Image(registerFile.toURI().toString());
        registerImageView.setImage(registerImage);
    }

    public void registerButtonOnAction (ActionEvent event) {
        int temp = -1;
        if (setPasswordField.getText().equals(confirmPasswordField.getText())) {
            temp=registerUser();
            confirmPasswordLabel.setText("");
            if(temp==0) {
                registrationMessageLabel1.setText("Pomyślnie zerejestrowano!");
            }
        } else {
            confirmPasswordLabel.setText("Hasła się różnią");
        }
    }

    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    //Metoda z rejestracją, połączona z bazą
    public int registerUser() {
        sample.Connect temp = new sample.Connect();
        List<String> temp1 = new ArrayList<String>();
        temp1 = temp.selectLogins();
        if(temp1.indexOf(usernameTextField.getText().toLowerCase())==-1){
            temp.insertUser(usernameTextField.getText().toLowerCase(),setPasswordField.getText(),nameTextField.getText(),surnameTextField.getText());
            return 0;
        }else{
            registrationMessageLabel2.setText("Podana nazwa jest zajęta");
            return 1;
        }

    }
}

