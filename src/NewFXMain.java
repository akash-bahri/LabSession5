/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import com.sun.javafx.logging.PlatformLogger.Level;
import com.sun.media.jfxmedia.logging.Logger;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Akash Bahri
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click here");
        btn.setOnAction(new EventHandler<ActionEvent>() {
     
            @Override
            public void handle(ActionEvent event) {
                
                try{
                    System.out.println("hello");
                    Parent pane = (Parent)FXMLLoader.load(getClass().getResource("FXML.fxml"));
                    primaryStage.getScene().setRoot(pane);
                }    
                catch(IOException ex)
                {
                    //Logger.getLogger(NewFXMain.class.getName()).log(Level.SEVERE,null,ex);
                }        
            }
        });




        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
