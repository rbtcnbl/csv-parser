package com.msr.pa.csv.parser.handler;

import com.msr.pa.csv.parser.Parser;
import com.msr.pa.csv.parser.data.EgissoBySnils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class EgissoBySnilsHandler {
    private final static int MSZ_CODE = 430;
    private final static String MIN_DATE = "01.01.1950";
    private final static Date MAX_DATE = new Date();

    private List<EgissoBySnils> items;
    // private Parser parser;


    public EgissoBySnilsHandler(List<EgissoBySnils> items) {
        this.items = items;
    }

    public String getFamilyWithMszCode() {
        StringBuilder builder = new StringBuilder();

        for (EgissoBySnils item : items) {
            if (item.getMszCode()== MSZ_CODE) {
                builder.append(item.toString()).append("\n");
            }
        }
        return builder.toString();
    }

    public String getAbnormalDate() {
        StringBuilder builder = new StringBuilder();
        Date dateMin = Parser.parseDate(MIN_DATE);

        for (EgissoBySnils item : items) {
            Date dateFromCsv = Parser.parseDate(item.getReceiveDate());
            if (dateFromCsv.before(dateMin) || dateFromCsv.after(MAX_DATE) || dateFromCsv.equals(MAX_DATE)) {
                builder.append(item.toString()).append("\n");
            }
        }

        return builder.toString();
    }


}
