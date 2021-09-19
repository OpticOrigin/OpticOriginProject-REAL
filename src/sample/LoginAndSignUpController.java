package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class LoginAndSignUpController implements Initializable {

    //@FXML
   // private Label myLabel;
    //private Client
    private ToggleGroup radioGroup = new ToggleGroup();
    ////////////////////////////////////////
    @FXML
    private TextArea infoDisplayArea;

    @FXML
    private TextField clientCity;

    @FXML
    private ComboBox<String> clientState;

    @FXML
    private ComboBox<String> clientCountry;


    //Registration Form PART
    @FXML
    private TextField glassPrescription;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField addresS;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField emailAdress;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;



    //REGISTRATION FORM PART password side
    @FXML
    private TextField registeringPassword;

    @FXML
    private TextField registeringConfirmPassword;


    //Login PART Form
    @FXML
    private TextField userName;

    @FXML
    private TextField passWord;


   /* public LoginAndSignUpController(){

        //Radio Groups
        maleRadioButton.setToggleGroup(radioGroup);
        femaleRadioButton.setToggleGroup(radioGroup);
    }*/



    //Login PART Form METHODS
    @FXML
    void canceLButton(ActionEvent event) {

    }

    @FXML
    void logInButton(ActionEvent event) throws IOException {

        if(userName.getText().length() == 0 || passWord.getText().length() ==0)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);// line 1
            alert.setTitle("Input Error!");// line 2  Information Dialog Box
            alert.setHeaderText(null);// line 3 This is header section to write heading
            alert.setContentText("Either the UserName or Password Field is Empty!\nPlease Fill All the Fields");
            alert.showAndWait(); // line 5

        }
        else
        {
            dataBaseStart();

        }

    }

    @FXML
    void signUpButton(ActionEvent event) throws IOException {
        //LoginAndSignUpController in = new LoginAndSignUpController();
        //addItems();
        clientState = new ComboBox<>();
        clientCountry = new ComboBox<>();
        //clientCountry.setItems(countryList);
        //clientState.setItems(stateList1);
        Parent root = FXMLLoader.load(getClass().getResource("RegistrationForm.fxml"));
        //clientCountry.setItems(countryList);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Registration Form!");
        stage.setScene(scene);
        stage.show();


    }

    public void dataBaseStart()
    {
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/optic_origin_security";
        final String SELECT_QUERY = "SELECT userName, passWord from opticoriginpassanduser where userName = ? and passWord = ?";

        try
        {
            Connection connection = null;
            connection = DriverManager.getConnection(DATABASE_URL, "root", "19$Faster100");
            PreparedStatement pstatement = null;
            pstatement = connection.prepareStatement(SELECT_QUERY);
            pstatement.setString(1,userName.getText());
            pstatement.setString(2,passWord.getText());
            ResultSet resultSet = pstatement.executeQuery();


            if(resultSet.next())
            {
                Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setTitle("Main Page!");
                stage.setScene(scene);
                stage.show();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Either Username or Password or Both is InCorrect");
            }

        }
        catch (
                Exception e)
        {
            e.printStackTrace();
        }
    }

    //REGISTRATION FORM PART METHODS
    @FXML
    void confirmAndRegisterButton(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("RegistrationFormPasswordPart.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Registration Form Password Part!");
        stage.setScene(scene);
        stage.show();

    }


    //REGISTRATION FORM PART METHODS password side
    @FXML
    void submitButton(ActionEvent event) {

    }

    @FXML
    void groupRadioButton(ActionEvent event) {

        femaleRadioButton.setToggleGroup(radioGroup);
        maleRadioButton.setToggleGroup(radioGroup);
        //String fx:value=

    }


    public void initialize(URL location, ResourceBundle resource)
    {
       /* clientState = new ComboBox<>();
        clientCountry = new ComboBox<>();
        clientCountry.setItems(countryList);
        clientState.setItems(stateList);*/
    }
}
