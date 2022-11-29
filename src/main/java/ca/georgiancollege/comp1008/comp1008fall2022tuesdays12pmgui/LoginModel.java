package ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;

public class LoginModel {

    //do we need instance variables?
    //if so, how many?

    private String username, password;
    private final String expectedUsername="admin", expectedPassword="pass";

    public LoginModel(){}
    public void processRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean validateData(){
        return username.equals(expectedUsername) && password.equals(expectedPassword);
    }
}
