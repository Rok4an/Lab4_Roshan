package com.roshan.lab4_roshan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private TextField;
    private daysField
    private airfareField;
    private carRentalField;
    private milesField;
    private parkingField;
    private taxiField;
    private registrationField;
    private lodgingField;
        
    private Label totalExpensesValue;
    private Label totalAllowedValue
    private Label excessValue;
    private Label savedValue;
    private Label errorLabel;

    private static final double MEALS_RATE_PER_DAY = 37.0;
    private static final double PARKING_CAP_PER_DAY = 10.0;
    private static final double TAXI_CAP_PER_DAY = 20.0;
    private static final double LODGING_CAP_PER_NIGHT = 95.0;
    private static final double MILEAGE_RATE = 0.27;

    @Override
    public void start(Stage stage) {
           
    }

    public static void main(String[] args) {
        launch();
    }

}