package org.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("article-form.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }




//    Stage window;
//    Scene scene1, scene2;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        window = primaryStage;
//
//        Label label1 = new Label("Welcome to HelloFX!");
//        Button button1 = new Button("go to scene 2!");
//        button1.setOnAction(e -> window.setScene(scene2));
//
////        Layout1
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1, button1);
//        scene1 = new Scene(layout1, 300, 300);
//
////        button 2
//        Label label2 = new Label("This scene sucks, go back to scene 2!");
//        Button button2 = new Button("go back to scene 1!");
//        button2.setOnAction(e -> window.setScene(scene1));
//
////        Layout2
//        VBox layout2 = new VBox(20);
//        layout2.getChildren().addAll(label2, button2);
//        scene2 = new Scene(layout2, 400, 400);
//
//        window.setScene(scene1);
//        window.setTitle("Title now");
//        window.show();
//
//    }


}