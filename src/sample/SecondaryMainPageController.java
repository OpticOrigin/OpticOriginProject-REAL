package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SecondaryMainPageController {
    //About US page part
    @FXML
    private TextArea firstTileTextArea;

    @FXML
    private TextArea thirdTileTextArea;

    @FXML
    private TextArea secondTileTextArea;

    //setter for About Us Page


    public void setFirstTileTextArea() {
        this.firstTileTextArea.isWrapText();
        this.firstTileTextArea.fontProperty();
        //this.firstTileTextArea.setFont();

        this.firstTileTextArea.setText("Optic Origin Mission is to make sure that the all the people in needy of eyeglasses can have a safe and affordable access to them through our platform. Not only do we provide affordable eyeglasses for the needy, we ourselves refurbish them. To this we are thrilled to serve the impoverished and also ensure the cleanliness of our environment!") ;
    }
    public void initialize()
    {
        setFirstTileTextArea();
    }

}
