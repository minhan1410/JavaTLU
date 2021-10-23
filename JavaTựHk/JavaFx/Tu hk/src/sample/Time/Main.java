package sample.Time;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Time");
        Parent root = FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
