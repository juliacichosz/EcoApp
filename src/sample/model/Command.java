package sample.model;

import javafx.event.ActionEvent;

public interface Command {

    void execute(ActionEvent actionEvent, String path);
}
