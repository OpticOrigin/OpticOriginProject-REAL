package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {

    //Order glasses part

    @FXML
    private ComboBox<?> sphereRight;

    @FXML
    private ComboBox<?> sphereLeft;

    @FXML
    private ComboBox<?> cylinderRight;

    @FXML
    private ComboBox<?> cylinderLeft;

    @FXML
    private ComboBox<?> axisRight;

    @FXML
    private ComboBox<?> axisLeft;

    @FXML
    void getGlassButtonMethod(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GetGlassPage.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Choose Your Glass(es)!");
        stage.setScene(scene);
        stage.show();

    }


    /*MainPage Methods*/
    @FXML
    void AboutUsMethod(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AboutUsPage.fxml"));
        //setFirstTileTextArea();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("About Us!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void carriersButtonMethod(ActionEvent event) {

    }

    @FXML
    void donateButtonMethod(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DonatePage.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Donate!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void getPrescriptionGlassesMethod(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OrderGlasses.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Glasses' Tank!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void inquiriesButtonMethod(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InquiriesPage.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("All The Inquiries!");
        stage.setScene(scene);
        stage.show();
    }


}

