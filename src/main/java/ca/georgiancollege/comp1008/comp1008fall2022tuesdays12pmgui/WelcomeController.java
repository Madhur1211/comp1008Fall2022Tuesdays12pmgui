package ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class WelcomeController {

    @FXML
    private Label message;

    @FXML
    private TextField input;

    @FXML
    private Button submit;

    @FXML
    void onImageClick(MouseEvent event) {

        //in order to open a new page, we need to determine which page to go to

       ImageView clickedImage = (ImageView)event.getSource();

        System.out.println(clickedImage.getImage().getUrl()); //full path of image
        String path = clickedImage.getImage().getUrl();

        String[] pathPieces = path.split("/");
//        for (String item: pathPieces) {
//            System.out.println(item);
//        }

        String fileNameAndExtension = pathPieces[pathPieces.length - 1];
        System.out.println(fileNameAndExtension);

        String justFileName = fileNameAndExtension.split("\\.")[0];
        System.out.println(justFileName);

        try{
            Utilities.openPage(justFileName, justFileName.toUpperCase());
        }
        catch (Exception e){
            message.setText(e.getMessage());
        }

    }

    @FXML
    void onHover(MouseEvent event){
        message.setText("Hovering Over: "+ event.getX() +","+event.getY() );
    }

    @FXML
    void initialize(){
        message.setText("");
    }
}
