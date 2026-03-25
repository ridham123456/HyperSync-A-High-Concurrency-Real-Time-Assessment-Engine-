package client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // આ લાઈન ત્યારે જ ચાલશે જ્યારે JavaFX સાચું સેટ થયું હશે
        Label label = new Label("🚀 HyperSync Project Setup is 100% COMPLETE!");
        Scene scene = new Scene(label, 400, 200);

        primaryStage.setTitle("Project Setup Test");
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println("✅ Check successful: JavaFX UI Libraries are working!");
        System.out.println("You can now build the 150-user quiz system. Good luck, Member 1!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}