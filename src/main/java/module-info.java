module ca.georgiancollege.comp1008.comp1008tuesdays12pmgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui to javafx.fxml;
    exports ca.georgiancollege.comp1008.comp1008fall2022tuesdays12pmgui;
}