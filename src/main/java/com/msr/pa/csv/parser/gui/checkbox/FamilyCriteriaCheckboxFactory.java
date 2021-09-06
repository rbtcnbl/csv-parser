package com.msr.pa.csv.parser.gui.checkbox;

import com.msr.pa.csv.parser.handler.FamilyCriteriaHandler;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class FamilyCriteriaCheckboxFactory extends CheckboxFactory {
    private FamilyCriteriaHandler handler;

    public FamilyCriteriaCheckboxFactory(FamilyCriteriaHandler handler, ViewCallback viewCallback) {
        super(viewCallback);
        this.handler = handler;
    }

    @Override
    public List<CheckBox> getCheckboxList() {
        List<CheckBox> checkBoxes = new ArrayList<>();
        checkBoxes.add(createCheckbox("СДД меньше 7000", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getFamilyWithLowSDD());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        return checkBoxes;
    }
}
