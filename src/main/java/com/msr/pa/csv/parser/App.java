package com.msr.pa.csv.parser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
            launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/csvGui.fxml"));
        stage.setScene(new Scene(root, 900, 750));
        stage.show();
    }
}
