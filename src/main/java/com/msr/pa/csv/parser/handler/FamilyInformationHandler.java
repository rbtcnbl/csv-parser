package com.msr.pa.csv.parser.handler;

import com.msr.pa.csv.parser.Parser;
import com.msr.pa.csv.parser.data.EgissoBySnils;
import com.msr.pa.csv.parser.data.FamilyItem;

import java.util.*;

public class FamilyInformationHandler {
    private final static String MIN_DATE = "01.01.1950";
    private final static Date MAX_DATE = new Date();

    private List<FamilyItem> familyItems;

    public FamilyInformationHandler(List<FamilyItem> familyItems) {
        this.familyItems = familyItems;
    }

    public String getNumberOfPeople() {
        Map<Integer, List<FamilyItem>> map = new HashMap<Integer, List<FamilyItem>>();
        for (FamilyItem item : familyItems) {
            List<FamilyItem> familyItems;
            if (map.containsKey(item.getFamilyId())) {
                familyItems = map.get(item.getFamilyId());
            } else {
                familyItems = new ArrayList<FamilyItem>();
            }
            familyItems.add(item);
            map.put(item.getFamilyId(), familyItems);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, List<FamilyItem>> entry : map.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue().size()).append("\n");
        }
        return result.toString();
    }

    public String getAbnormalBirthDate() {
        StringBuilder builder = new StringBuilder();
        Date dateMin = Parser.parseDate(MIN_DATE);

        for (FamilyItem item : familyItems) {
            Date dateFromCsv = Parser.parseDate(item.getBirthdate());
            if (dateFromCsv.before(dateMin) || dateFromCsv.after(MAX_DATE) || dateFromCsv.equals(MAX_DATE)) {
                builder.append(item.toString()).append("\n");
            }
        }

        return builder.toString();
    }



}
