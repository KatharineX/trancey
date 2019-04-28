package packager;
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
import block.*;


public class Main extends Application {

    public String printHistory() {
        BlockChain bc = new BlockChain();
        ClothingArticle a = new ClothingArticle("12345", new String[] {"Cotton", "Polyester"}, "Bangladesh", "Zara");
        Block b = new Block(BlockChain.size, a);
        bc.insertBlock(b);

        Block b2 = new Block(BlockChain.size, "China", new String[] {"Packaged by StarPackaging."});
        bc.insertBlock(b2);
        return bc.printChain();
    }

    @Override
    public void start(Stage stage) {

        Text text1 = new Text("Article ID");
        Text text3 = new Text("Location");
        Text text5 = new Text("Notes");

        TextField id = new TextField("12345");
        String idText = id.getText();
        System.out.println(idText);

        TextField textfield1 = new TextField("12345");
        TextField location = new TextField("China");
        TextField textField5 = new TextField("Packaged by StarPackaging.");
        textField5.setPrefHeight(100);
        textField5.setPrefWidth(250);

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
        gridPane.add(text1, 0, 2);
        gridPane.add(textfield1, 1, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(location, 1, 3);
        gridPane.add(text5, 0, 4);
        gridPane.add(textField5, 1, 4);

        gridPane.add(button1, 1, 5);
        //gridPane.add(button2, 1, 9);
        gridPane.add(printHistoryButton, 1, 6);


        //Styling nodes
        button1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        printHistoryButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");



        text1.setStyle("-fx-font: normal bold 20px 'arial' ");
        text3.setStyle("-fx-font: normal bold 20px 'arial' ");
        text5.setStyle("-fx-font: normal bold 20px 'arial' ");

        gridPane.setStyle("-fx-background-color: WHITE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Packaging Log");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}