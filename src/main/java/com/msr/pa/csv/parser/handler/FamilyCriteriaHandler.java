package com.msr.pa.csv.parser.handler;

import com.msr.pa.csv.parser.data.FamilyCriteria;

import java.util.List;

public class FamilyCriteriaHandler {
    private final static int LOW_SDD = 7000;

    private List<FamilyCriteria> items;

    public FamilyCriteriaHandler(List<FamilyCriteria> familyItems) {
        this.items = familyItems;
    }

    public String getFamilyWithLowSDD(){
        StringBuilder builder = new StringBuilder();

        for (FamilyCriteria item : items) {
            if (item.getSddFns() < LOW_SDD) {
                builder.append(item.toString()).append("\n");
            }
        }
        return builder.toString();
    }
}
