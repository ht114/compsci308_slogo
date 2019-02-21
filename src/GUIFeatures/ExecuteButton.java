package GUIFeatures;

import javafx.scene.control.Button;

public class ExecuteButton extends Button {
    public static final String EXECUTE_STRING = "Execute";

    public ExecuteButton() {
        super(EXECUTE_STRING);
        this.getStyleClass().add("execute-button");
    }
}
