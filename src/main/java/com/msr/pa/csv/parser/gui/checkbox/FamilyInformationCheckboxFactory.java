package com.msr.pa.csv.parser.gui.checkbox;

import com.msr.pa.csv.parser.handler.FamilyInformationHandler;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class FamilyInformationCheckboxFactory extends CheckboxFactory {

    private FamilyInformationHandler handler;

    public FamilyInformationCheckboxFactory(FamilyInformationHandler handler, ViewCallback viewCallback) {
        super(viewCallback);
        this.handler = handler;
    }

    @Override
    public List<CheckBox> getCheckboxList() {
        List<CheckBox> checkBoxes = new ArrayList<>();
        checkBoxes.add(createCheckbox("Количество людей в семье", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getNumberOfPeople());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        checkBoxes.add(createCheckbox("Аномальные даты рождения", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getAbnormalBirthDate());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        return checkBoxes;
    }
}
