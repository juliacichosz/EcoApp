package sample.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
    GoTo class represents design pattern: COMMAND
 */
public class GoTo implements Command{

    public static void changeWindow(ActionEvent actionEvent, FXMLLoader loader) throws IOException {
        Parent homePageParent = loader.load();

        Scene homePageScene = new Scene(homePageParent);
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(homePageScene);
        appStage.show();
    }

    @Override
    public void execute(ActionEvent actionEvent, String path) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        try {
            changeWindow(actionEvent, loader);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
