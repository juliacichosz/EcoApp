package sample.model;

import javafx.event.ActionEvent;

/*
    Command interface represents design pattern: COMMAND
 */
public interface Command {

    void execute(ActionEvent actionEvent, String path);
}
