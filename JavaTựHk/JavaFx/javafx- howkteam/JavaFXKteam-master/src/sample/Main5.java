package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Programming Language");
        CheckBox box1 = new CheckBox("Java");
        CheckBox box2 = new CheckBox("C#");
        CheckBox box3 = new CheckBox("Python");
        box1.setSelected(true);
        Button button = new Button("Submit");
        button.setOnAction(e -> {
            String message = "Your language:";
            if (box1.isSelected())
                message += box1.getText();
            if (box2.isSelected())
                message += box2.getText();
            if (box3.isSelected())
                message += box3.getText();
            System.out.println(message);
        });
        HBox layoutH = new HBox(10);
        layoutH.getChildren().addAll(box1, box2, box3);
        VBox layoutV = new VBox(10);
        layoutV.getChildren().addAll(label, layoutH, button);
        Scene scene = new Scene(layoutV, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
