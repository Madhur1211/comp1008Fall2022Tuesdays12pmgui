package ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Label errorMessage;
    @FXML
    private TextField textUsername;

    @FXML
    private PasswordField textPassword;

    LoginModel model = new LoginModel();

    @FXML
    void ofRegisterClick(ActionEvent event) {
        System.out.println("You clicked on Register button");

        try{
            Utilities.openPage("register", "Register!");
        }
        catch (Exception e){
            Utilities.showAlert(Alert.AlertType.ERROR,
                    "Page Load",
                    "Could not open register page").show();
        }
    }

    @FXML
    void onLoginClick(ActionEvent event) {
        try{
            model.processRequest(textUsername.getText(), textPassword.getText());
            Utilities.openPage("welcome", "Welcome!");
        }
        catch (Exception e){
            errorMessage.setText(e.getMessage());
        }
    }

    @FXML
    void initialize(){
        System.out.println("Loaded!");

        errorMessage.setText("");
    }

}

