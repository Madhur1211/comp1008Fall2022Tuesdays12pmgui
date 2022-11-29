package ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegisterModel {


    private String username, password, confirmPassword;

    public RegisterModel(){}

//    public RegisterModel(String username, String password, String confirmPassword){

    public void processRequest(String username, String password, String confirmPassword){

        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    /**
     * Validate all instance variables and ensure that they are all at least 5 characters long
     * @return
     */
    public boolean validateData() throws Exception{
        return username.length() >= 5
                && password.length() >= 5
                && confirmPassword.length() >=5
                && password.equals(confirmPassword)
                && createUser();

    }
    //if data is good, CREATE a new file: filename=username.txt. file content = password
    public boolean createUser() throws Exception{

        //file manipulation
        Path rootPath = Path.of("src/main/resources/ca/georgiancollege/comp1008/comp1008fall2022tuesdays12pmgui");
        Path dataPath = rootPath.resolve("data");
        if(!dataPath.toFile().exists()){
            Files.createDirectory(dataPath);
        }
        Path userPath = dataPath.resolve(username + ".txt");
        Files.writeString(userPath, password);

        return true;
    }


}
