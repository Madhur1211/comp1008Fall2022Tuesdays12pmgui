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

        System.out.println("You click on Login button");

        String receivedUsername = textUsername.getText();
        String receivedPassword = textPassword.getText();

        model.processRequest(receivedUsername, receivedPassword);

        //String expectedUsername = "admin", expectedPassword = "pass";

//        if(receivedUsername.equals(expectedUsername)
//        &&
//        receivedPassword.equals(expectedPassword)
//        ){
            if(model.validateData()){
            errorMessage.setText("");

            Utilities.showAlert(Alert.AlertType.INFORMATION, "Good job!", "You may enter").show();

            try{
                Utilities.openPage("welcome", "Welcome Everyone!");
            }
            catch (Exception e){
                Utilities.showAlert(Alert.AlertType.ERROR, "Not Found", "Could not load the page").show();
            }

        }
        else{
            System.out.println("bad!");
            /*
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No good!");
            alert.setContentText("Invalid username and/or password");
            alert.show();

             */
            errorMessage.setText("Invalid username and/or password");
        }


    }

    @FXML
    void initialize(){
        System.out.println("Loaded!");

        errorMessage.setText("");
    }

}

