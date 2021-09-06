package com.msr.pa.csv.parser.gui.checkbox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;

import java.util.List;

public abstract class CheckboxFactory {

    protected ViewCallback viewCallback;

    public CheckboxFactory(ViewCallback viewCallback) {
        this.viewCallback = viewCallback;
    }

    public abstract List<CheckBox> getCheckboxList();

    protected CheckBox createCheckbox(
            String name,
            Callback callback
    ) {
        CheckBox checkBox = new CheckBox(name);
        checkBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                callback.invoke(checkBox.isSelected());
            }
        });
        return checkBox;
    }

    public interface ViewCallback {
        void show(String text);
    }

    interface Callback {
        void invoke(boolean isSelected);
    }
}
