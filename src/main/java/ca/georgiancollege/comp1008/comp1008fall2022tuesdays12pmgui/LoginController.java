package ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField textUsername;

    @FXML
    private PasswordField textPassword;

    @FXML
    void ofRegisterClick(ActionEvent event) {
        System.out.println("You clicked on Register button");
    }

    @FXML
    void onLoginClick(ActionEvent event) {

        System.out.println("You click on Login button");

    }

    @FXML
    void initialize(){
        System.out.println("Loaded!");
    }

}

