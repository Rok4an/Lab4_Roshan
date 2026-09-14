package com.roshan.lab4_roshan;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private TextField daysField;
    private TextField airfareField;
    private TextField carRentalField;
    private TextField milesField;
    private TextField parkingField;
    private TextField taxiField;
    private TextField registrationField;
    private TextField lodgingField;
        
    private Label totalExpensesValue;
    private Label totalAllowedValue;
    private Label excessValue;
    private Label savedValue;
    private Label errorLabel;

    private static final double MEALS_RATE_PER_DAY = 37.0;
    private static final double PARKING_CAP_PER_DAY = 10.0;
    private static final double TAXI_CAP_PER_DAY = 20.0;
    private static final double LODGING_CAP_PER_NIGHT = 95.0;
    private static final double MILEAGE_RATE = 0.27;

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        grid.getStyleClass().add("root-pane");

        Label title = new Label("Travel Expense Calculator");
        title.setId("title-label");
        grid.add(title, 0, 0, 2, 1);

        daysField = new TextField();
        grid.add(new Label("Number of days on the trip:"), 0, 1);
        grid.add(daysField, 1, 1);

        airfareField = new TextField();
        grid.add(new Label("Airfare ($), if any:"), 0, 2);
        grid.add(airfareField, 1, 2);

        carRentalField = new TextField();
        grid.add(new Label("Car rental fees ($), if any:"), 0, 3);
        grid.add(carRentalField, 1, 3);

        milesField = new TextField();
        grid.add(new Label("Miles driven (private vehicle), if any:"), 0, 4);
        grid.add(milesField, 1, 4);

        parkingField = new TextField();
        grid.add(new Label("Parking fees ($), if any:"), 0, 5);
        grid.add(parkingField, 1, 5);

        taxiField = new TextField();
        grid.add(new Label("Taxi charges ($), if any:"), 0, 6);
        grid.add(taxiField, 1, 6);

        registrationField = new TextField();
        grid.add(new Label("Registration fees ($), if any:"), 0, 7);
        grid.add(registrationField, 1, 7);

        lodgingField = new TextField();
        grid.add(new Label("Lodging charges per night ($), if any:"), 0, 8);
        grid.add(lodgingField, 1, 8);
        
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculateExpenses());
        grid.add(calculateButton, 0, 9, 2, 1);
        GridPane.setHalignment(calculateButton, HPos.CENTER);

        errorLabel = new Label();
        errorLabel.setId("label-error");
        grid.add(errorLabel, 0, 10, 2, 1);

        totalExpensesValue = new Label("$0.00");
        Label lblTotal = new Label("Total expenses incurred:");
        lblTotal.getStyleClass().add("result-label");
        totalExpensesValue.getStyleClass().add("result-value");
        grid.add(lblTotal, 0, 11);
        grid.add(totalExpensesValue, 1, 11);

        totalAllowedValue = new Label("$0.00");
        Label lblAllowed = new Label("Total allowable expenses:");
        lblAllowed.getStyleClass().add("result-label");
        totalAllowedValue.getStyleClass().add("result-value");
        grid.add(lblAllowed, 0, 12);
        grid.add(totalAllowedValue, 1, 12);

        excessValue = new Label("$0.00");
        Label lblExcess = new Label("Excess to be paid by employee:");
        lblExcess.getStyleClass().add("result-label");
        excessValue.getStyleClass().add("result-value");
        grid.add(lblExcess, 0, 13);
        grid.add(excessValue, 1, 13);

        savedValue = new Label("$0.00");
        Label lblSaved = new Label("Amount saved by employee:");
        lblSaved.getStyleClass().add("result-label");
        savedValue.getStyleClass().add("result-value");
        grid.add(lblSaved, 0, 14);
        grid.add(savedValue, 1, 14);

        Scene scene = new Scene(grid, 460, 620);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Travel Expense Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}