package com.roshan.lab4_roshan;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private TextField daysField = new TextField();
    private TextField airfareField = new TextField();
    private TextField carRentalField = new TextField();
    private TextField milesField = new TextField();
    private TextField parkingField = new TextField();
    private TextField lodgingField = new TextField();

    private Label totalExpensesLabel = new Label("Total Expenses: $0.00");
    private Label allowableExpensesLabel = new Label("Allowable Expenses: $0.00");
    private Label excessLabel = new Label("Excess / Amount Saved: $0.00");
    private Label errorLabel = new Label();

    private final double MEALS_PER_DAY = 37.00;
    private final double PARKING_PER_DAY = 10.00;
    private final double LODGING_PER_DAY = 95.00;
    private final double MILEAGE_RATE = 0.27;

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15));
        grid.setAlignment(Pos.CENTER);

        grid.add(new Label("Number of Days:"), 0, 0);
        grid.add(daysField, 1, 0);

        grid.add(new Label("Airfare ($):"), 0, 1);
        grid.add(airfareField, 1, 1);

        grid.add(new Label("Car Rental ($):"), 0, 2);
        grid.add(carRentalField, 1, 2);

        grid.add(new Label("Miles Driven:"), 0, 3);
        grid.add(milesField, 1, 3);

        grid.add(new Label("Parking Fees ($):"), 0, 4);
        grid.add(parkingField, 1, 4);

        grid.add(new Label("Lodging Charges ($):"), 0, 5);
        grid.add(lodgingField, 1, 5);

        Button calcButton = new Button("Calculate Expenses");
        Button clearButton = new Button("Reset");

        calcButton.setOnAction(e -> calculateExpenses());
        clearButton.setOnAction(e -> clearFields());

        grid.add(calcButton, 0, 6);
        grid.add(clearButton, 1, 6);

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.setAlignment(Pos.CENTER);
        
        errorLabel.setStyle("-fx-text-fill: red;");

        root.getChildren().addAll( grid, errorLabel, totalExpensesLabel, allowableExpensesLabel, excessLabel);

        Scene scene = new Scene(root, 400, 450);
        primaryStage.setTitle("Travel Expense Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
           
    }

    public static void main(String[] args) {
        launch();
    }

}