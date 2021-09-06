package com.msr.pa.csv.parser.gui.checkbox;

import com.msr.pa.csv.parser.handler.EgissoBySnilsHandler;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class EgissoBySnilsCheckboxFactory extends CheckboxFactory {

    private EgissoBySnilsHandler handler;

    public EgissoBySnilsCheckboxFactory(EgissoBySnilsHandler handler, ViewCallback viewCallback) {
        super(viewCallback);
        this.handler = handler;
    }

    @Override
    public List<CheckBox> getCheckboxList() {
        List<CheckBox> checkBoxes = new ArrayList<>();
        checkBoxes.add(createCheckbox("Код МСЗ 430", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getFamilyWithMszCode());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        checkBoxes.add(createCheckbox("Аномальные даты", new Callback() {
            @Override
            public void invoke(boolean isSelected) {
                if (isSelected) {
                    viewCallback.show(handler.getAbnormalDate());
                } else {
                    viewCallback.show("");
                }
            }
        }));
        return checkBoxes;
    }
}
