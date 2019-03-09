package View.GUIFeatures.Panes;

import Model.ModelInterfaces.IModel;
import View.ObserverInterfaces.IObserver;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hsingchih Tang
 * @author Eric Lin
 */
public class Console extends TextArea implements IObserver {

    public static final String PROMPT_TEXT = "Enter Commands Here";
    private IModel myValModel;
    private List<String> myDisplay;

    public Console(double w, double h) {
        myDisplay = new ArrayList<>();
        this.setMaxSize(w,h);
        this.setPromptText(PROMPT_TEXT);
        this.setFocusTraversable(false);
        this.setWrapText(true);
        this.getStyleClass().add("console-text-area");
        this.setOnMouseClicked(e->clearText());
    }

    public void clearText() {
        this.clear();
    }

    @Override
    public void updateData() {
        System.out.println("console gets notified");
        myDisplay = myValModel.getData();
        this.setText(myDisplay.get(0));
        System.out.println(myDisplay.get(0));

    }

    @Override
    public void setupModel(IModel model) {
        myValModel = model;
        myValModel.registerObserver(this);
    }

    @Override
    public IModel getModel() {
        return myValModel;
    }
}
