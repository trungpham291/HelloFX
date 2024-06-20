package org.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class Main extends Application {

    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window  = primaryStage;
        window.setTitle("JavaFX- thenewbutton");
        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        
        choiceBox.getItems().addAll("Apple", "Banana", "Bacon", "Ham", "MeatBAll");
//Set a default values
        choiceBox.setValue("Apple");
        
        button.setOnAction(e -> getChoice(choiceBox));


////        Form
//        TextField nameInput = new TextField();
//
//        button = new Button("Click me");
//        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));
        
//        Layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);
        

//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10, 10, 10, 10));
//        grid.setVgap(20);
//        grid.setHgap(10);
//
////      name label
//        Label nameLabel = new Label("Username: ");
//        GridPane.setConstraints(nameLabel, 0, 0);
////        Name Input
//        TextField nameInput = new TextField("Trung");
//        nameInput.setPromptText("enter your name");
//        GridPane.setConstraints(nameInput, 1, 0);
//
////        Password label
//        Label passLabel = new Label("Password: ");
//        GridPane.setConstraints(passLabel, 0, 1);
//
////        Password Input
//        TextField passInput = new TextField();
//        passInput.setPromptText("Enter password");
//        GridPane.setConstraints(passInput,1,1);
//
//        Button loginButton = new Button("Login");
//        GridPane.setConstraints(loginButton, 1, 2);
//
//        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);


//        HBox topMenu = new HBox();
//        Button buttonA = new Button("file");
//        Button buttonB = new Button("about");
//        Button buttonC = new Button("exit");
//        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
//
//        VBox centerMenu = new VBox();
//        Button button1 = new Button("A");
//        Button button2 = new Button("B");
//        Button button3 = new Button("C");
//        centerMenu.getChildren().addAll(button1, button2, button3);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setCenter(centerMenu);

//        window.setOnCloseRequest(e -> {
//            e.consume();
//            closeProgram();
//        });
//
//        button = new Button("close me");
//        button.setOnAction(e -> closeProgram());

//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
        Scene scene = new Scene( layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

//    private boolean isInt(TextField input, String message) {
//        try{
//            int age = Integer.parseInt(input.getText());
//            System.out.println("User is: " + age );
//            return true;
//        } catch (NumberFormatException e) {
//            System.out.println("Error: " + message + " is not a number");
//            return false;
//        }
//    }
//    private void closeProgram(){
//        Boolean answer = ConfirmBox.display("Title of window", "Are you sure you want to exit?");
//        if(answer){
//            window.close();
//        }
//    }
}