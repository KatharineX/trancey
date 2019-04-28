package sample;

import block.BlockChain;
import block.ClothingArticle;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import block.Block;

public class Main extends Application {
    String idText;
    String[] materialsText;
    String locationText;
    String brandText;
    String notesText;
    String[] notesTextArray;

    public String printHistory() {
        BlockChain bc = new BlockChain();
        ClothingArticle a = new ClothingArticle("12345", new String[] {"Cotton", "Polyester"}, "Bangladesh", "Zara");
        Block b = new Block(BlockChain.size, a);
        bc.insertBlock(b);
        return bc.printChain();

    }

    public BlockChain getBlockM(){
        BlockChain bc = new BlockChain();
        ClothingArticle c = new ClothingArticle(this.idText, this.materialsText, this.locationText, this.brandText);
        Block b = new Block(bc.size, c);
        bc.insertBlock(b);
        return bc;
    }

    @Override
    public void start(Stage stage) {

        Text text2 = new Text("Materials");
        Text text3 = new Text("Location");
        Text text4 = new Text("Brand");
        Text text5 = new Text("Notes");

        TextField id = new TextField("12345");
        TextField materials = new TextField("Cotton, Polyester");
        TextField location = new TextField("Bangladesh");
        TextField brand = new TextField("Zara");
        TextField notes = new TextField();
        notes.setPrefHeight(100);
        notes.setPrefWidth(250);

        idText = id.getText();
        materialsText = new String[] {materials.getText()};
        locationText = location.getText();
        brandText = brand.getText();
        notesText = notes.getText();
        notesTextArray = new String[] {notesText};

        //Creating Buttons
        Button button1 = new Button("Submit");
        button1.setOnAction((ActionEvent pages) -> {
            Label historyLog1 = new Label("You have successfully created a block\n             ID NUMBER: " + idText);
            StackPane printlayout1 = new StackPane();
            printlayout1.getChildren().add(historyLog1);
            Scene secondScene1 = new Scene(printlayout1, 300,300);
            Stage secondStage1 = new Stage();

            secondStage1.setTitle("Successfully created!");
            secondStage1.setScene(secondScene1);
            secondStage1.show();
        });

        Button button2 = new Button("Clear");
        Button printHistoryButton = new Button("Print History");
        printHistoryButton.setOnAction((ActionEvent page) -> {
            Label historyLog = new Label(printHistory());
            StackPane printlayout = new StackPane();
            printlayout.getChildren().add(historyLog);

            Scene secondScene = new Scene(printlayout, 500,500);

            Stage secondStage = new Stage();
            secondStage.setTitle("History Log");
            secondStage.setScene(secondScene);
            secondStage.show();


        });


        //Creating a Grid Pane
        GridPane gridPane = new GridPane();
        //Setting size for the pane
        gridPane.setMinSize(600, 130);
        //Setting the padding
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(50);
        gridPane.setHgap(50);
        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);
        //Arranging all the nodes in the grid
       // gridPane.add(text1, 0, 1);
       // gridPane.add(id, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(materials, 1, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(location, 1, 3);
        gridPane.add(text4, 0, 4);
        gridPane.add(brand, 1, 4);
        gridPane.add(text5, 0, 5);
        gridPane.add(notes, 1, 5);

        gridPane.add(button1, 1, 6);
        //gridPane.add(button2, 1, 9);
        gridPane.add(printHistoryButton, 1, 7);


        //Styling nodes
        button1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        printHistoryButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");



        // text1.setStyle("-fx-font: normal bold 20px 'arial' ");
        text2.setStyle("-fx-font: normal bold 20px 'arial' ");
        text3.setStyle("-fx-font: normal bold 20px 'arial' ");
        text4.setStyle("-fx-font: normal bold 20px 'arial' ");
        text5.setStyle("-fx-font: normal bold 20px 'arial' ");

        gridPane.setStyle("-fx-background-color: WHITE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Manufacturer Log");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}