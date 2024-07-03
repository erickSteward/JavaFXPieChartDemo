package com.example.chartsdemo;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Apple", 30),
                new PieChart.Data("Banana", 25),
                new PieChart.Data("Cherry", 15),
                new PieChart.Data("Date", 10),
                new PieChart.Data("ElderBerry", 20)

        );

        PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Friut Consuption");

        Scene scene = new Scene(chart, 800, 600);
        stage.setTitle("Pie Chart Demo");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

    }
}
