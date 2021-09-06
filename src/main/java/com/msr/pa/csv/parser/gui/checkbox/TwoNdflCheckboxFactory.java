package com.msr.pa.csv.parser.gui.checkbox;

import com.msr.pa.csv.parser.handler.TwoNdflHandler;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class TwoNdflCheckboxFactory extends CheckboxFactory {
    private TwoNdflHandler handler;

    public TwoNdflCheckboxFactory(ViewCallback viewCallback) {
        super(viewCallback);
    }

    @Override
    public List<CheckBox> getCheckboxList() {
        List<CheckBox> checkBoxes = new ArrayList<>();
        checkBoxes.add(createCheckbox("???????", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getSum());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        return checkBoxes;
    }
}
