package sample.Main13;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    ProgressBar progressBar;
    @FXML
    ProgressIndicator progressIndicator;
    @FXML
    Label label;
    doWork task;
    public void start (ActionEvent event){
        task = new doWork();
        progressBar.progressProperty().bind(task.progressProperty());
        progressIndicator.progressProperty().bind(task.progressProperty());
        label.textProperty().bind(task.messageProperty());
        new Thread(task).start();
    }
    public void cancel (ActionEvent event){
        task.cancel();
        progressBar.progressProperty().unbind();
        progressBar.setProgress(0);
        progressIndicator.progressProperty().unbind();
        progressIndicator.setProgress(0);
        label.textProperty().unbind();
        label.setText("ready");
    }
}
class doWork extends Task<Void>{

    @Override
    protected Void call() throws Exception {
        for (int i=0; i<10; i++){
            if (isCancelled()){
                updateMessage("Cancelled");
                break;
            }
            updateProgress(i+1,10);
            updateMessage("Loading");
            Thread.sleep(1000);
        }
        updateMessage("Finished");
        return null;
    }
}
