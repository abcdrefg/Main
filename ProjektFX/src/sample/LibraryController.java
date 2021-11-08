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
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class LibraryController implements Initializable {
//
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
    @FXML private Label rdrTitle;
    @FXML private Label witcherTitle;
    @FXML private Label cyberTitle;
    @FXML private Label scTitle;
    @FXML private Label limboTitle;
    @FXML private Label codTitle;
    @FXML private Label machTitle;
    @FXML private Label gameTitle21;
    @FXML private Label portalTitle;
    @FXML private Label lifeTitle;
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
    //Korzystanie z metod z maina
    private static LibraryController LibInstance;
    public LibraryController() {
        LibInstance = this;
    }
    public static LibraryController getInstance() {
        return LibInstance;
    }

    File playFile = new File("img/play.png");
    Image playImage = new Image(playFile.toURI().toString());

    private Connect temporary1 = new Connect();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       //Ikona RDR
        File RDRFile = new File("img/games/rdr.jpg");
        Image RDRImage = new Image(RDRFile.toURI().toString());
        RDRImageView.setImage(RDRImage);
        //Ikona Wiedźmina
        File WitcherFile = new File("img/games/witcher.jpg");
        Image WitcherImage = new Image(WitcherFile.toURI().toString());
        WitcherImageView.setImage(WitcherImage);
        //Ikona Cyberpunka
        File CyberFile = new File("img/games/cyber.jpeg");
        Image CyberImage = new Image(CyberFile.toURI().toString());
        CyberImageView.setImage(CyberImage);
        //Ikona StarCrafta
        File SCFile = new File("img/games/star.jpg");
        Image SCImage = new Image(SCFile.toURI().toString());
        SCImageView.setImage(SCImage);
        //Ikona Limbo
        File LimboFile = new File("img/games/limbo.jpg");
        Image LimboImage = new Image(LimboFile.toURI().toString());
        LimboImageView.setImage(LimboImage);
        //Ikona COD
        File CODFile = new File("img/games/ghosts.jpg");
        Image CODImage = new Image(CODFile.toURI().toString());
        CODImageView.setImage(CODImage);
        //Ikona Mach
        File MachFile = new File("img/games/mach.png");
        Image MachImage = new Image(MachFile.toURI().toString());
        MachImageView.setImage(MachImage);
        //Ikona Stardew
        File StardewFile = new File("img/games/stardew.jpg");
        Image StardewImage = new Image(StardewFile.toURI().toString());
        StardewImageView.setImage(StardewImage);
        //Ikona Portal
        File PortalFile = new File("img/games/portal.jpg");
        Image PortalImage = new Image(PortalFile.toURI().toString());
        PortalImageView.setImage(PortalImage);
        //Ikona Life
        File LifeFile = new File("img/games/lis.jpg");
        Image LifeImage = new Image(LifeFile.toURI().toString());
        LifeImageView.setImage(LifeImage);

        CheckGames();
    }

    public void CheckGames(){
        List<Integer> TemporaryList1=new ArrayList<Integer>();
        TemporaryList1=temporary1.selectLib();
        if(TemporaryList1.indexOf(1)>(-1)){
            RDRImageView.setBlendMode(BlendMode.SRC_OVER);
            rdrTitle.setBlendMode(BlendMode.SRC_OVER);
            rdrButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(2)>(-1)){
            WitcherImageView.setBlendMode(BlendMode.SRC_OVER);
            witcherTitle.setBlendMode(BlendMode.SRC_OVER);
            witcherButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(3)>(-1)){
            CyberImageView.setBlendMode(BlendMode.SRC_OVER);
            cyberTitle.setBlendMode(BlendMode.SRC_OVER);
            cyberButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(4)>(-1)){
            SCImageView.setBlendMode(BlendMode.SRC_OVER);
            scTitle.setBlendMode(BlendMode.SRC_OVER);
            scButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(5)>(-1)){
            LimboImageView.setBlendMode(BlendMode.SRC_OVER);
            limboTitle.setBlendMode(BlendMode.SRC_OVER);
            limboButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(6)>(-1)){
            CODImageView.setBlendMode(BlendMode.SRC_OVER);
            codTitle.setBlendMode(BlendMode.SRC_OVER);
            codButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(7)>(-1)){
            MachImageView.setBlendMode(BlendMode.SRC_OVER);
            machTitle.setBlendMode(BlendMode.SRC_OVER);
            machButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(8)>(-1)){
            StardewImageView.setBlendMode(BlendMode.SRC_OVER);
            gameTitle21.setBlendMode(BlendMode.SRC_OVER);
            stardewButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(9)>(-1)){
            PortalImageView.setBlendMode(BlendMode.SRC_OVER);
            portalTitle.setBlendMode(BlendMode.SRC_OVER);
            portalButton.setImage(playImage);
        }

        if(TemporaryList1.indexOf(10)>(-1)){
            LifeImageView.setBlendMode(BlendMode.SRC_OVER);
            lifeTitle.setBlendMode(BlendMode.SRC_OVER);
            lifeButton.setImage(playImage);
        }
    }

    public void rdrPlayButton() {
        File file = new File("D:/rdr2/Red Dead Redemption 2/RDR2.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void witcherPlayButton() {}
    public void cyberPlayButton() {}
    public void scPlayButton() {
        File file = new File("D:/sc/StarCraft II/StarCraft II.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void limboPlayButton() {
        File file = new File("E:/SteamLibrary/steamapps/common/Limbo/limbo.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void codPlayButton() {
        File file = new File("F:/SteamLibrary/steamapps/common/Call of Duty Ghosts/iw6sp64_ship.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void machPlayButton() {
        File file = new File("E:/SteamLibrary/steamapps/common/Machinarium/Machinarium.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void stardewPlayButton() {
        File file = new File("E:/SteamLibrary/steamapps/common/Stardew Valley/Stardew Valley.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void portalPlayButton() {
        File file = new File("D:/SteamLibrary/steamapps/common/Portal 2/portal2.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void lifePlayButton() {
        File file = new File("F:/SteamLibrary/steamapps/common/Life Is Strange/Binaries/Win32/LifeIsStrange.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
