package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.PopupCongratulations;
import sample.model.User;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/start.fxml"));
        primaryStage.setTitle("EcoApp");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        setObservers();
    }

    public void setObservers() {
        User.getINSTANCE().attach(new PopupCongratulations());
    }

    public static void main(String[] args) {
        launch(args);
    }
}