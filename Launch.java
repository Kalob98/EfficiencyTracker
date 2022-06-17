package com.example.ifbproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Launch extends Application {
    
    //starts the application
    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File("src/main/java/com/example/ifbproject/Views/LoginPage.fxml").toURI().toURL();
        
        Scene scene = new Scene(FXMLLoader.load(url), 600, 400);
        stage.setTitle("IFB Project");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}