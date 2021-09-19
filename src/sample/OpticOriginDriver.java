package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpticOriginDriver extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        //LoginAndSignUpController in = new LoginAndSignUpController();
        //in.addItems();
        Parent root = FXMLLoader.load(getClass().getResource("LoginForm.fxml"));
        primaryStage.setTitle("OpticOrigin");
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //LoginAndSignUpController in = new LoginAndSignUpController();
        //in.addItems();
        launch(args);


    }
}
