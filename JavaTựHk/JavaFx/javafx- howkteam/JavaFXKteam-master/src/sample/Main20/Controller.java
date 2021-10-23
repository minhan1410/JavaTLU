package sample.Main20;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    LineChart<String, Number> lineChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        XYChart.Data<String, Number> jan = new XYChart.Data<>("Jan", 300);
        XYChart.Data<String, Number> feb = new XYChart.Data<>("Feb", 400);
        XYChart.Data<String, Number> mar = new XYChart.Data<>("Mar", 600);
        XYChart.Data<String, Number> apr = new XYChart.Data<>("Apr", 900);
        series.getData().addAll(jan, feb, mar, apr);
        series.setName("Salary per month of An");
        lineChart.getData().add(series);

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        XYChart.Data<String, Number> jan1 = new XYChart.Data<>("Jan", 200);
        XYChart.Data<String, Number> feb1 = new XYChart.Data<>("Feb", 400);
        XYChart.Data<String, Number> mar1 = new XYChart.Data<>("Mar", 700);
        XYChart.Data<String, Number> apr1 = new XYChart.Data<>("Apr", 300);
        series1.getData().addAll(jan1, feb1, mar1, apr1);
        series1.setName("Salary per month of Minh");
        lineChart.getData().add(series1);
    }
}
