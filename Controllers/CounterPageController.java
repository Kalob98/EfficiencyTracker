package com.example.ifbproject.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Kalob Reinholz
 *
 * Last edited: 6/15/2022
 *
 * Controller Class for the CounterPage. Adds the buttons that increase and decrease the counter and saves that number
 */

public class CounterPageController {
    @FXML
    private MenuBar myMenuBar;
    @FXML
    private Label name;
    @FXML
    private Label counter;
    
    //Number used to keep track of the number the counter is currently at
    private static int count = 0;
    //Number that changes the amount the counter goes up or down
    private final int numberToIncOrDec = 100;
    //Gets the user's name
    private final String userName = LoginPageController.getName();
    //Creates a HashMap to keep all the user's production for the month by the week
    private static HashMap<String, ArrayList<ArrayList<Integer>>> map = new HashMap<>();
    
    //Displays the user's name and sets the counter
    public void initialize(){
        name.setText(userName);
        counter.setText(Integer.toString(count));
    }
    
    //button to add to counter
    @FXML
    private void addToTotal(ActionEvent actionEvent) {
        int number = Integer.parseInt(counter.getText());
        counter.setText(Integer.toString(number + numberToIncOrDec));
    }
    
    //button to decrease counter
    @FXML
    private void subToTotal(ActionEvent actionEvent) {
        int number = Integer.parseInt(counter.getText());
        
        //doesn't let the counter go below 0
        if(number > 0) counter.setText(Integer.toString(number - numberToIncOrDec));
    }
    
    //Takes you to the efficiency page
    @FXML
    private void efficiencyPage(ActionEvent actionEvent) throws IOException {
        URL url = new File("src/main/java/com/example/ifbproject/Views/EfficiencyPage.fxml").toURI().toURL();
        
        Parent infoParent = FXMLLoader.load(url);
        Scene infoScene = new Scene(infoParent);
        
        Stage window = (Stage) myMenuBar.getScene().getWindow();
        
        window.setScene(infoScene);
        window.show();
    }
    
    //Button to save the count
    @FXML
    private void saveCount(ActionEvent actionEvent) {
        //puts the count into the map
        map.get(LoginPageController.getName()).get(3).set(4, Integer.parseInt(counter.getText()));
        
        //updates count
        count = map.get(LoginPageController.getName()).get(3).get(4);
    }
    
    // ############### Getter ###############
    public static HashMap<String, ArrayList<ArrayList<Integer>>> getMap() {
        return map;
    }
}