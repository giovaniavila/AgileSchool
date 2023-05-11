package com.example.agileschool;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Chart implements renamed {

    @FXML
    private BarChart<String, Number> barChartId;

    @FXML
    private NumberAxis notasGrafico;

    @FXML
    private CategoryAxis tarefasGrafico;
    @Override
    public void initialize(URL url, ResourceBundle rb){
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("device Comparison");
        series.getData().add(new XYChart.Data<>("desktop", 3));
        series.getData().add(new XYChart.Data<>("tablet", 6));
        series.getData().add(new XYChart.Data<>("tarefa 3", 5));

        barChartId.getData().add(series);
    }

}
