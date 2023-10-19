/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        btn.setText("change colour to green");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        int c=0;    
            @Override
            public void handle(ActionEvent event) {
                c++;
                System.out.println("color will change to green");
                if(c%2==0)
                {
                    btn.setText("change colour to green");
                    btn.setStyle("-fx-background-color: #ff0000;");
                }
                else
                {
                    btn.setText("change colour to red");
                    btn.setStyle("-fx-background-color: #00ff00;");
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
