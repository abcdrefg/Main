package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;
import sample.Connect;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class ShopController implements Initializable {

    @FXML private ImageView RDRImageView;
    @FXML private ImageView WitcherImageView;
    @FXML private ImageView CyberImageView;
    @FXML private ImageView SCImageView;
    @FXML private ImageView LimboImageView;
    @FXML private ImageView CODImageView;
    @FXML private ImageView MachImageView;
    @FXML private ImageView StardewImageView;
    @FXML private ImageView PortalImageView;
    @FXML private ImageView LifeImageView;
    @FXML private ImageView rdrButton;
    @FXML private ImageView witcherButton;
    @FXML private ImageView cyberButton;
    @FXML private ImageView scButton;
    @FXML private ImageView limboButton;
    @FXML private ImageView codButton;
    @FXML private ImageView machButton;
    @FXML private ImageView stardewButton;
    @FXML private ImageView portalButton;
    @FXML private ImageView lifeButton;
    private Connect temporary2 = new Connect();
    private List<Integer> Temporary2= new ArrayList<Integer>();

    //Do zmiany przezroczystości ikon i napisów: RDRImageView.setBlendMode(BlendMode.SRC_OVER)
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Ikona RDR
        File RDRFile = new File("img/games/rdr.jpg");
        Image RDRImage = new Image(RDRFile.toURI().toString());
        RDRImageView.setImage(RDRImage);
        //Plus
        File RDRAddFile = new File("img/plus.png");
        Image RDRAddImage = new Image(RDRAddFile.toURI().toString());
        rdrButton.setImage(RDRAddImage);

        //Ikona Wiedźmina
        File WitcherFile = new File("img/games/witcher.jpg");
        Image WitcherImage = new Image(WitcherFile.toURI().toString());
        WitcherImageView.setImage(WitcherImage);
        //Plus
        File witcherAddFile = new File("img/plus.png");
        Image witcherAddImage = new Image(witcherAddFile.toURI().toString());
        witcherButton.setImage(witcherAddImage);

        //Ikona Cyberpunka
        File CyberFile = new File("img/games/cyber.jpeg");
        Image CyberImage = new Image(CyberFile.toURI().toString());
        CyberImageView.setImage(CyberImage);
        //Plus
        File cyberAddFile = new File("img/plus.png");
        Image cyberAddImage = new Image(cyberAddFile.toURI().toString());
        cyberButton.setImage(cyberAddImage);

        //Ikona StarCrafta
        File SCFile = new File("img/games/star.jpg");
        Image SCImage = new Image(SCFile.toURI().toString());
        SCImageView.setImage(SCImage);
        //Plus
        File scAddFile = new File("img/plus.png");
        Image scAddImage = new Image(scAddFile.toURI().toString());
        scButton.setImage(scAddImage);

        //Ikona Limbo
        File LimboFile = new File("img/games/limbo.jpg");
        Image LimboImage = new Image(LimboFile.toURI().toString());
        LimboImageView.setImage(LimboImage);
        //Plus
        File limboAddFile = new File("img/plus.png");
        Image limboAddImage = new Image(limboAddFile.toURI().toString());
        limboButton.setImage(limboAddImage);

        //Ikona COD
        File CODFile = new File("img/games/ghosts.jpg");
        Image CODImage = new Image(CODFile.toURI().toString());
        CODImageView.setImage(CODImage);
        //Plus
        File codAddFile = new File("img/plus.png");
        Image codAddImage = new Image(codAddFile.toURI().toString());
        codButton.setImage(codAddImage);

        //Ikona Mach
        File MachFile = new File("img/games/mach.png");
        Image MachImage = new Image(MachFile.toURI().toString());
        MachImageView.setImage(MachImage);
        //Plus
        File machAddFile = new File("img/plus.png");
        Image machAddImage = new Image(machAddFile.toURI().toString());
        machButton.setImage(machAddImage);

        //Ikona Stardew
        File StardewFile = new File("img/games/stardew.jpg");
        Image StardewImage = new Image(StardewFile.toURI().toString());
        StardewImageView.setImage(StardewImage);
        //Plus
        File stardewAddFile = new File("img/plus.png");
        Image stardewAddImage = new Image(stardewAddFile.toURI().toString());
        stardewButton.setImage(stardewAddImage);

        //Ikona Portal
        File PortalFile = new File("img/games/portal.jpg");
        Image PortalImage = new Image(PortalFile.toURI().toString());
        PortalImageView.setImage(PortalImage);
        //Plus
        File portalAddFile = new File("img/plus.png");
        Image portalAddImage = new Image(portalAddFile.toURI().toString());
        portalButton.setImage(portalAddImage);

        //Ikona Life
        File LifeFile = new File("img/games/lis.jpg");
        Image LifeImage = new Image(LifeFile.toURI().toString());
        LifeImageView.setImage(LifeImage);
        //Plus
        File lifeAddFile = new File("img/plus.png");
        Image lifeAddImage = new Image(lifeAddFile.toURI().toString());
        lifeButton.setImage(lifeAddImage);
        Temporary2=temporary2.selectLib();
    }

    //Dodawanie gier do biblioteki przy użyciu plusa
    public void rdrAdd() {
        if(Temporary2.indexOf(1)==(-1)) {
            temporary2.insertGame(1);
        }
    }
    public void witcherAdd() {
        if(Temporary2.indexOf(2)==(-1)) {
            temporary2.insertGame(2);
        }

    }
    public void cyberAdd() {
        if(Temporary2.indexOf(3)==(-1)) {
            temporary2.insertGame(3);
        }

    }
    public void starcraftAdd() {
        if(Temporary2.indexOf(4)==(-1)) {
            temporary2.insertGame(4);
        }
    }
    public void limboAdd() {
        if(Temporary2.indexOf(5)==(-1)) {
            temporary2.insertGame(5);
        }
    }
    public void codAdd() {
        if(Temporary2.indexOf(6)==(-1)) {
            temporary2.insertGame(6);
        }
    }
    public void machAdd() {
        if(Temporary2.indexOf(7)==(-1)) {
            temporary2.insertGame(7);
        }
    }
    public void stardewAdd() {
        if(Temporary2.indexOf(8)==(-1)) {
            temporary2.insertGame(8);
        }
    }
    public void portalAdd() {
        if(Temporary2.indexOf(9)==(-1)) {
            temporary2.insertGame(9);
        }
    }
    public void lifeAdd() {
        if(Temporary2.indexOf(10)==(-1)) {
            temporary2.insertGame(10);
        }
    }
}
